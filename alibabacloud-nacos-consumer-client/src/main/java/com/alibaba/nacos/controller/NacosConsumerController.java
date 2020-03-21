package com.alibaba.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author DeZhe
 * @date 2020/3/21 - 10:35
 */
@RestController
public class NacosConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-client-service}")
    private String url;

    @GetMapping("/consumer/str")
    public String get(){
        return this.restTemplate.getForObject(this.url+"/hello/str",String.class);
    }

}
