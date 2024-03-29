package com.flyfish.guliMall.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @autohr flyfish
 * @date: 2023/3/7 17:41
 * @description:
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
@EnableFeignClients
public class OrderApplication7000 {
    public static void main(String[] args) {
        log.info("orderApplication7000服务已启动");
        SpringApplication.run(OrderApplication7000.class,args);
    }
}
