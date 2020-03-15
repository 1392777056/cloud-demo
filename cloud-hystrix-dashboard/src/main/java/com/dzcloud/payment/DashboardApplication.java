package com.dzcloud.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author DeZhe
 * @date 2020/3/15 - 16:22
 */
@SpringBootApplication
@EnableHystrixDashboard //开启hystrix仪表盘监控
public class DashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(DashboardApplication.class,args);
    }

}
