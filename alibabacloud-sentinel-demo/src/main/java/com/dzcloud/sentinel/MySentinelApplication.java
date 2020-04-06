package com.dzcloud.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author DeZhe
 * @date 2020/4/6 - 9:40
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MySentinelApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySentinelApplication.class,args);
    }

}
