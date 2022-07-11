package com.athena.core.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    RestTemplate restTemplate(ObjectMapper objectMapper){

        RestTemplate restTemplate = new RestTemplate();

        return restTemplate;

//        MappingJackson2CborHttpMessageConverter converter = restTemplate.getMessageConverters().stream()
//                .filter(MappingJackson2CborHttpMessageConverter.class:: isInstance)
//                .map(MappingJackson2CborHttpMessageConverter.class:: cast)
//                .findFirst()
//                .orElseThrow(()-> new RuntimeException(" Mapping not found"));
//        converter.setObjectMapper(objectMapper);
//        return restTemplate;
    }
}
