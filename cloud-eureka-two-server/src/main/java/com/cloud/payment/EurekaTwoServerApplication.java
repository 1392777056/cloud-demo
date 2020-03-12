package com.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author DeZhe
 * @date 2020/3/12 - 11:23
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaTwoServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaTwoServerApplication.class,args);
    }

}
