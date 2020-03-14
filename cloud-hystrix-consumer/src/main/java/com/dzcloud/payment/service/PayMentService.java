package com.dzcloud.payment.service;

import com.dzcloud.payment.service.fallbackservice.PayMentFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author DeZhe
 * @date 2020/3/14 - 10:39
 */
@Component
@FeignClient(value = "DZCLOUD-HYSTRIX-SERVICE",fallback = PayMentFallbackService.class)
public interface PayMentService {

    /**
     * 正确返回
     * @return
     */
    @GetMapping("/hystrix/ok")
    String strOkss();

    /**
     * 超时返回
     * @return
     */
    @GetMapping("/hystrix/timeout")
    String strTimeOutss();

}
