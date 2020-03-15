package com.dzcloud.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author DeZhe
 * @date 2020/3/15 - 17:27
 */
@SpringBootApplication
@EnableEurekaClient
public class GetwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GetwayApplication.class,args);
    }

}
