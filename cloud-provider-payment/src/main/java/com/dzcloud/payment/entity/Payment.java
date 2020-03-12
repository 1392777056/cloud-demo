package com.dzcloud.payment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author DeZhe
 * @date 2020/3/12 - 9:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private Long id;

    private String serial;

}
