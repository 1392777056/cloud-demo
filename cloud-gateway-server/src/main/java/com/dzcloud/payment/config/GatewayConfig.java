package com.dzcloud.payment.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author DeZhe
 * @date 2020/3/15 - 18:03
 */
//@Configuration
public class GatewayConfig {

    /**
     * gateway的两种方式 xml方式和注解
     * @param builder
     * @return
     */
   // @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("path_route_boke",r->r.path("m0_37619264").uri("https://blog.csdn.net/m0_37619264")).build();

    }

}
