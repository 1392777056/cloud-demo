package com.dzcloud.payment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author DeZhe
 * @date 2020/3/12 - 10:31
 */
@Configuration
public class ApplicationConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
