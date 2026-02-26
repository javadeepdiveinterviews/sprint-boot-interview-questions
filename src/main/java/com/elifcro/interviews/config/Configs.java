package com.elifcro.interviews.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import tools.jackson.databind.ObjectMapper;

@Configuration
public class Configs {

    @Bean
    public ObjectMapper customObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        System.out.println("Object Created for ObjectMapper");
        return mapper;
    }

    @Bean
    public RestTemplate restClient() {
        System.out.println("Object Created for RestTemplate");
        return new RestTemplate();
    }
}
