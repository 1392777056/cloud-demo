package com.dzcloud.payment.controller;

import com.dzcloud.payment.service.HystrixService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author DeZhe
 * @date 2020/3/14 - 11:55
 */
@RestController
@RequestMapping("hystrix")
public class HystrixController {

    @Resource
    private HystrixService service;

    @GetMapping("/ok")
    public String getOk(){
        return this.service.strOk();
    }

    @GetMapping("/timeout")
    public String getTimeOut(){
        return this.service.strTimeOut();
    }
}
