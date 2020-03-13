package com.dzcloud.payment;

import com.dzcloud.myrule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author DeZhe
 * @date 2020/3/12 - 10:28
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
//自己设置改变负载均衡方式
@RibbonClient(name = "CLOUD-PROVIDER-PAYMENT",configuration = MyRule.class)
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }
}
