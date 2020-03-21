package com.alibaba.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DeZhe
 * @date 2020/3/21 - 11:58
 */
@RestController
@RequestMapping("config")
@RefreshScope
public class NacosConfigController {

    @Value("${server.info}")
    public String info;

    @RequestMapping("info")
    public String gets() {
        return "ok"+this.info;
    }

}
