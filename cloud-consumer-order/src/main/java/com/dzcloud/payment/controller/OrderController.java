package com.dzcloud.payment.controller;

import com.dzcloud.payment.common.CommonRepo;
import com.dzcloud.payment.entity.Payment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author DeZhe
 * @date 2020/3/12 - 10:30
 */
@RestController
@RequestMapping("order")
public class OrderController {

    private final static String PAYMENT_URL = "http://CLOUD-PROVIDER-PAYMENT";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/create")
    public CommonRepo<Payment> create(@RequestBody Payment payment){
        return this.restTemplate.postForObject(PAYMENT_URL+"/pay/save",payment,CommonRepo.class);
    }

    @GetMapping("/findById/{id}")
    public CommonRepo<Payment> create(@PathVariable("id") Long id) {
        return this.restTemplate.getForObject(PAYMENT_URL + "/pay/findById/" + id, CommonRepo.class);
    }
}
