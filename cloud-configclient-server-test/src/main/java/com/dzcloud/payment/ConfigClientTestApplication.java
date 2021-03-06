package com.dzcloud.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author DeZhe
 * @date 2020/3/16 - 10:57
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientTestApplication.class,args);
    }

}
