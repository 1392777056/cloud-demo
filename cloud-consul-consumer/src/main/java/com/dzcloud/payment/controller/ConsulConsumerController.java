package com.dzcloud.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author DeZhe
 * @date 2020/3/13 - 9:33
 */
@RestController
@RequestMapping("consul")
public class ConsulConsumerController {

    private final static String PAYMENT_URL = "http://consul-server-name";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/find")
    public String create(){
        return this.restTemplate.getForObject(PAYMENT_URL+"/con/str", String.class);
    }

}
