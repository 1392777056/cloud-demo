package com.dzcloud.payment.service.impl;

import com.dzcloud.payment.dao.PaymentMapper;
import com.dzcloud.payment.entity.Payment;
import com.dzcloud.payment.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author DeZhe
 * @date 2020/3/12 - 9:08
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment findById(Long id) {
        return paymentMapper.findById(id);
    }
}
