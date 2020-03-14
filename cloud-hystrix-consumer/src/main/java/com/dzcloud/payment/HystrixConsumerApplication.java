package com.dzcloud.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author DeZhe
 * @date 2020/3/14 - 19:25
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class HystrixConsumerApplication {

    public static void main(String[] args) {

        SpringApplication.run(HystrixConsumerApplication.class,args);

    }

}
