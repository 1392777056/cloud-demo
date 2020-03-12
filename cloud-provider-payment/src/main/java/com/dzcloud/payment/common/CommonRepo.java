package com.dzcloud.payment.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author DeZhe
 * @date 2020/3/12 - 9:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonRepo<T> {

    private Integer code;
    private String msg;
    private T  date;

    public CommonRepo(Integer code,String msg){
        this(code,msg,null);
    }

}
