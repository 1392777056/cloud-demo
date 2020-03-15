package com.dzcloud.payment.controller;

import com.dzcloud.payment.service.HystrixService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public String getOk() {
        return this.service.strOk();
    }

    @GetMapping("/timeout")
    public String getTimeOut() {
        return this.service.strTimeOut();
    }

    /**
     * 服务熔断演示
     */
    @GetMapping("/findById/{id}")
    public String strById(@PathVariable("id") String id) {
        return this.service.strById(id);
    }
}