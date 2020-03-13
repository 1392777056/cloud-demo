package com.dzcloud.payment.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author DeZhe
 * @date 2020/3/13 - 9:33
 */
@RestController
@RequestMapping("con")
public class ConsulController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/str")
    public String getstr(){
        return ""+port+"===="+ UUID.randomUUID().toString();
    }

}
