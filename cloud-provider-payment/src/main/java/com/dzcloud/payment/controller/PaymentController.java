package com.dzcloud.payment.controller;

import com.dzcloud.payment.common.CommonRepo;
import com.dzcloud.payment.entity.Payment;
import com.dzcloud.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * @author DeZhe
 * @date 2020/3/12 - 9:09
 */
@RestController
@RequestMapping("pay")
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/str")
    public String getStr(){
        Payment payment = this.paymentService.findById((long) 6);
        log.info("======"+payment.toString());
        return port+"==ffffff==="+UUID.randomUUID().toString();
    }

    @PostMapping("/save")
    public CommonRepo create(@RequestBody Payment payment){
        int flag = this.paymentService.create(payment);
        if (flag<0){
            return new CommonRepo(444,"添加失败：");
        }
        return new CommonRepo(200,"添加成功"+port);
    }

    @GetMapping("/findById/{id}")
    public CommonRepo findall(@PathVariable("id") Long id){
        Payment payment = this.paymentService.findById(id);
        if (payment == null){
            return new CommonRepo(404,"查找失败",null);
        }
        return new CommonRepo(200,"查找成功"+port,payment);
    }


    @GetMapping("findService")
    public Object getService(){
        List<String> services = discoveryClient.getServices();
        log.info("微服务中的所有service");
        for (String service : services) {
            System.out.println(service);
        }

        System.out.println("=============");
        log.info("service下面的各种实例");
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PROVIDER-PAYMENT");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient.getServices();
    }

}
