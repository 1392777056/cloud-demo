package com.dzcloud.payment.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author DeZhe
 * @date 2020/3/14 - 10:39
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-PAYMENT")
public interface PayMentService {

    @GetMapping("/pay/str")
    String findStr();

}
