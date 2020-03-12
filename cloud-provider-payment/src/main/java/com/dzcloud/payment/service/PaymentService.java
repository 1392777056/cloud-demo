package com.dzcloud.payment.service;

import com.dzcloud.payment.entity.Payment;

/**
 * @author DeZhe
 * @date 2020/3/12 - 9:07
 */
public interface PaymentService {

    int create(Payment payment);

    Payment findById(Long id);

}
