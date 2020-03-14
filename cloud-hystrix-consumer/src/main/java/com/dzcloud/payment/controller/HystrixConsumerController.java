package com.dzcloud.payment.controller;

import com.dzcloud.payment.service.PayMentService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author DeZhe
 * @date 2020/3/14 - 19:27
 */
@RequestMapping("hystrixconsumer")
@RestController
//@DefaultProperties(defaultFallback = "")  //全局的服务降级出来方法
public class HystrixConsumerController {

    @Resource
    private PayMentService payMentService;

    @GetMapping("/ok")
    public String getOk(){
        return this.payMentService.strOkss();
    }

    @GetMapping("/timeout")
    public String getTimeOut(){
        return this.payMentService.strTimeOutss();
    }

}
