package com.dzcloud.payment.dao;

import com.dzcloud.payment.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author DeZhe
 * @date 2020/3/12 - 9:06
 */
@Mapper
public interface PaymentMapper {

    int create(Payment payment);

    Payment findById(@Param("id") Long id);

}
