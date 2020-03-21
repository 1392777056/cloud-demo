package com.alibaba.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DeZhe
 * @date 2020/3/21 - 10:00
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/str")
    public String str(){
        return "ni hao ~ =="+this.port;
    }

}
