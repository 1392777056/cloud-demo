package com.dzcloud.payment.service.fallbackservice;

import com.dzcloud.payment.service.PayMentService;
import org.springframework.stereotype.Component;

/**
 * @author DeZhe
 * @date 2020/3/14 - 19:48
 */
@Component
public class PayMentFallbackService implements PayMentService {

    @Override
    public String strOkss() {
        return "调用strok长时间，请稍后再试";
    }

    @Override
    public String strTimeOutss() {
        return "系统繁忙---timeouts--，请稍后再试";
    }
}
