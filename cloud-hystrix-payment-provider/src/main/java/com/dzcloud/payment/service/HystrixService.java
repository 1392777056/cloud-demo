package com.dzcloud.payment.service;

/**
 * @author DeZhe
 * @date 2020/3/14 - 11:55
 */
public interface HystrixService {

    /**
     * 正确返回
     * @return
     */
    String strOk();

    /**
     * 超时返回
     * @return
     */
    String strTimeOut();

}
