package com.dzcloud.payment.service.impl;

import com.dzcloud.payment.service.HystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author DeZhe
 * @date 2020/3/14 - 11:56
 */
@Service
public class HystrixServiceImpl implements HystrixService {

    @Override
    public String strOk() {
        return "正确返回："+Thread.currentThread().getName()+"\t"+"----";
    }

    @HystrixCommand(fallbackMethod = "strTimeOutHandle",
        commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "2000")
        }
    )
    @Override
    public String strTimeOut() {
        //int i = 10/0;
        /*try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return "超时返回："+Thread.currentThread().getName()+"\t"+"----"+"超时等待了3秒";
    }

    public String strTimeOutHandle() {
        return "系统出错请稍后等待--"+"\t"+Thread.currentThread().getName();
    }
}
