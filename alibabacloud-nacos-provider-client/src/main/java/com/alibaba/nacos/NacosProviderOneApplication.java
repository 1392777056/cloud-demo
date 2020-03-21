package com.alibaba.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author DeZhe
 * @date 2020/3/21 - 9:59
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosProviderOneApplication.class,args);
    }

}
