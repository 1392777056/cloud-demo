package com.dzcloud.payment.filter;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @author DeZhe
 * @date 2020/3/15 - 18:56
 */
@Component
@Slf4j
public class MyGatewayFilter implements GlobalFilter, Ordered {

    /**
     * 设置过滤器 条件
     * @param exchange
     * @param chain
     * @return
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("************** 开始 *******************");
        String name = exchange.getRequest().getQueryParams().get("name").toString();
        if (StringUtils.isEmpty(name)){
            log.info("************** name的值不能为Null *******************"+new Date());
            exchange.getResponse().setStatusCode(HttpStatus.BAD_REQUEST);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    /**
     * 过滤器的加载顺序
     * @return
     */
    @Override
    public int getOrder() {
        return 0;
    }
}
