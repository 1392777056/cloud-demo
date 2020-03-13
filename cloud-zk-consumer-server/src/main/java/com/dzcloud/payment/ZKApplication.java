package com.dzcloud.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author DeZhe
 * @date 2020/3/13 - 9:30
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZKApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZKApplication.class,args);
    }

}
