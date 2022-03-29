package com.example.restapi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.example.restapi")
public class MyConfig {
    @Bean // данный биан используем для HTTP request
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
