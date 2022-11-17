package com.athena.core.client;


import com.athena.core.dto.AuthResponse;
import com.athena.core.dto.EHRSettingDTO;
import com.athena.core.exception.AthenaException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import static org.springframework.http.HttpHeaders.AUTHORIZATION;

@Component
@Slf4j
public class EHRAthenaConfig {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ObjectMapper objectMapper;


    // Athena creds
//    private String athenaClientID = "0oad6x3rw5yKe56N1297";
//    private String athenaClientSecret ="dQkDc2x6OR0_k2CQWwVcFN6ub-K5XLnlRtYh6cQD";
    private String athenaUrl="https://api.preview.platform.athenahealth.com/oauth2/v1";

//    @Value("${athena.clientId}")
//    private String athenaClientID;
//    @Value("${athena.secretId}")
//    private String athenaClientSecret;
//    @Value("${athena.oauth.url}")
//    private String athenaUrl;

    //Athena token expiration config
    private String liveToken = null;
    private long tokenTime = 0;
    private long tokenExpirationTime=1800000;


    public String getAccessToken(String orgId, EHRSettingDTO ehrSettingDTO) {
        long elapsedTime = System.currentTimeMillis() - tokenTime;

        if (liveToken == null || elapsedTime > tokenExpirationTime) {
            liveToken = null; // remove old token
            liveToken = getNewAccessTokenFromAthena(orgId, ehrSettingDTO); //generate new token
            tokenTime = System.currentTimeMillis();
            log.info("liveToken:--{}", liveToken);
            return liveToken;
        }
        return liveToken;
    }

    private String getNewAccessTokenFromAthena(String orgId, EHRSettingDTO ehrSettingDTO) {
        log.info("Client Id : "+ehrSettingDTO.getClientId());
        log.info("Client Secrete : "+ehrSettingDTO.getClientSecrete());

        HttpHeaders headers = new HttpHeaders();
        String encodedAuth = Base64.encodeBase64String(String.format("%s:%s", ehrSettingDTO.getClientId(), ehrSettingDTO.getClientSecrete()).getBytes());
        log.info("encodedAuth:-"+encodedAuth);
        headers.set(AUTHORIZATION, "Basic "+ encodedAuth);
        MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();
        parameters.add("grant_type", "client_credentials");
        parameters.add("scope", "athena/service/Athenanet.MDP.*");

        log.info("getNewAccessTokenFromAthena:- {}", athenaUrl+"/token");

        HttpEntity httpEntity = new HttpEntity<>(parameters, headers);
        log.info("httpEntity {}", httpEntity);
        return AthenaException.AthenaAPIErrorHandling(() -> restTemplate.postForObject(athenaUrl+"/token", httpEntity, AuthResponse.class).getAccessToken());
    }

}