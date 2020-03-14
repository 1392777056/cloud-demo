package com.dzcloud.payment.controller;

import com.dzcloud.payment.service.PayMentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author DeZhe
 * @date 2020/3/14 - 10:46
 */
@RequestMapping("/open")
@RestController
public class OpenfeignController {

    @Resource
    private PayMentService payMentService;

    @RequestMapping("/aa")
    public String find(){
        return this.payMentService.findStr();
    }


}
