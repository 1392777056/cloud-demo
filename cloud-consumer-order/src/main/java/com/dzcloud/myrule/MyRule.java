package com.dzcloud.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author DeZhe
 * @date 2020/3/13 - 17:12
 */
@Configuration
public class MyRule {

    @Bean
    public IRule myRulesss(){
        return new RandomRule();
    }

}
