package com.dzcloud.sentinel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DeZhe
 * @date 2020/4/6 - 9:41
 */
@RequestMapping("/test")
@RestController
public class TestController {

    @GetMapping("/str1")
    public String str1(){
        return "str1";
    }

    @GetMapping("/str2")
    public String str2(){
        return "str2";
    }


}
