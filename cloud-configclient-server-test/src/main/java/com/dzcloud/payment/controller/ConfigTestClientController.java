package com.dzcloud.payment.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DeZhe
 * @date 2020/3/16 - 11:14
 */
@RestController
@RequestMapping("configclient")
@RefreshScope
public class ConfigTestClientController {

    @Value("${dezhe.info}")
    private String info;

    @Value("${server.port}")
    private String port;

    @RequestMapping("info")
    public String info(){
        return this.info+"----"+port;
    }

}
