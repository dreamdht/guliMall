package com.flyfish.guliMall.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @autohr flyfish
 * @date: 2023/3/7 17:41
 * @description:
 */
@SpringBootApplication
@Slf4j
public class OrderApplication7000 {
    public static void main(String[] args) {
        log.info("orderApplication7000服务已启动");
        SpringApplication.run(OrderApplication7000.class,args);
    }
}
