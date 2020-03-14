package com.dzcloud.payment.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author DeZhe
 * @date 2020/3/14 - 11:16
 */
@Configuration
public class FeignConfig {

    /**
     * 查看openfeign logger的日志信息
     */
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }

}
