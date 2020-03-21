package com.alibaba.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author DeZhe
 * @date 2020/3/21 - 10:34
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosComsumerClient {

    public static void main(String[] args) {
        SpringApplication.run(NacosComsumerClient.class,args);
    }

}
