package com.athena.core.client;



import com.athena.core.dto.AuthResponse;
import com.athena.core.exception.AthenaException;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import static org.springframework.http.HttpHeaders.AUTHORIZATION;

@Component
@Slf4j
public class AuthConfig {

    // To call Athena API
    @Autowired
    private RestTemplate restTemplate;

    // Athena creds
    private String athenaClientID;
    private String athenaClientSecret;
    private String athenaUrl;


    //Athena token expiration config
    private String liveToken = null;
    private long tokenTime = 0;
    private long tokenExpirationTime;


    @Autowired
    public AuthConfig(RestTemplate restTemplate,
                      @Value("${athena.clientId}") String clientId,
                      @Value("${athena.secretId}") String clientSecret,
                      @Value("${athena.oauth.url}") String url,
                      @Value("${athena.token.expiration-time}") long tokenExpirationTime) {
        this.restTemplate = restTemplate;
        this.athenaClientID = clientId;
        this.athenaClientSecret = clientSecret;
        this.athenaUrl = url;
        this.tokenExpirationTime = tokenExpirationTime;

    }


    public String getAccessToken() {
        long elapsedTime = System.currentTimeMillis() - tokenTime;

        if (liveToken == null || elapsedTime > tokenExpirationTime) {
            liveToken = null; // remove old token
            liveToken = getNewAccessTokenFromAthena(); //generate new token
            tokenTime = System.currentTimeMillis();
            log.info("liveToken:--{}", liveToken);
            return liveToken;
        }
        return liveToken;
    }

    private String getNewAccessTokenFromAthena() {
        HttpHeaders headers = new HttpHeaders();
        String encodedAuth = Base64.encodeBase64String(String.format("%s:%s", athenaClientID, athenaClientSecret).getBytes());
        log.info("encodedAuth:-"+encodedAuth);
        headers.set(AUTHORIZATION, "Basic "+ encodedAuth);
        MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();
        parameters.add("grant_type", "client_credentials");
        parameters.add("scope", "athena/service/Athenanet.MDP.*");

        log.info("getNewAccessTokenFromAthena:- {}", athenaUrl+"/token");

        HttpEntity httpEntity = new HttpEntity<>(parameters, headers);
        log.info("httpEntity {}", httpEntity);
        return AthenaException.AthenaAPIErrorHandling(() -> {
            return restTemplate.postForObject(athenaUrl+"/token", httpEntity, AuthResponse.class).getAccessToken();
        });
    }

}