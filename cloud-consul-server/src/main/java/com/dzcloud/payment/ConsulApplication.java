package com.dzcloud.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author DeZhe
 * @date 2020/3/13 - 12:28
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulApplication.class,args);
    }

}
