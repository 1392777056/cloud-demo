package com.dzcloud.payment.service.impl;

import cn.hutool.core.util.IdUtil;
import com.dzcloud.payment.service.HystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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

    /*@HystrixCommand(fallbackMethod = "strTimeOutHandle",
        commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "2000")
        }
    )*/
    @Override
    public String strTimeOut() {
        //int i = 10/0;
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "超时返回："+Thread.currentThread().getName()+"\t"+"----"+"超时等待了3秒";
    }

    public String strTimeOutHandle() {
        return "系统出错请稍后等待--"+"\t"+Thread.currentThread().getName();
    }

    //============================ 服务熔断 ==========================================

    //十秒钟10次请求错误率达到百分之60 熔断器开启,达到半开的状态，可以试着让一些请求进行尝试，如果没有达到阈值，就恢复正常，关闭熔断器
    @HystrixCommand(fallbackMethod = "strByIdHandle",
        commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"), //是否开启熔断器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"), //请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"), //时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"), //失败率达到后跳闸




        }
    )
    @Override
    public String strById(@PathVariable("id") String id) {
        if(Integer.parseInt(id) < 0) {
            throw new RuntimeException("服务出错，id不能为负数。。。。");
        }
        System.out.println("正常访问---："+id);
        return "正常访问:---id为---"+id+"\t"+ IdUtil.simpleUUID();
    }

    public String strByIdHandle(@PathVariable("id") String id) {
        return "系统出错,id为负数---id为："+id;
    }
}
