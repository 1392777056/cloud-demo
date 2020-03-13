package com.dzcloud.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author DeZhe
 * @date 2020/3/13 - 12:33
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulConsumerApplication.class,args);
    }
}
