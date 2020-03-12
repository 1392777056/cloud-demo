package com.dzcloud.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author DeZhe
 * @date 2020/3/12 - 9:00
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class,args);
    }

}
