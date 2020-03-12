package com.dzcloud.payment.controller;

import com.dzcloud.payment.common.CommonRepo;
import com.dzcloud.payment.entity.Payment;
import com.dzcloud.payment.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author DeZhe
 * @date 2020/3/12 - 9:09
 */
@RestController
@RequestMapping("pay")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping("/save")
    public CommonRepo create(@RequestBody Payment payment){
        int flag = this.paymentService.create(payment);
        if (flag<0){
            return new CommonRepo(444,"添加失败");
        }
        return new CommonRepo(200,"添加成功");
    }

    @GetMapping("/findById/{id}")
    public CommonRepo create(@PathVariable("id") Long id){
        Payment payment = this.paymentService.findById(id);
        if (payment == null){
            return new CommonRepo(404,"查找失败",null);
        }
        return new CommonRepo(200,"查找成功",payment);
    }


}
