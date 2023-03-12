package com.flyfish.guliMall.product;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @autohr flyfish
 * @date: 2023/3/7 18:07
 * @description:
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
@EnableFeignClients
public class ProductApplication8000 {
    public static void main(String[] args) {
        log.info("ProductApplication8000服务已启动");
        SpringApplication.run(ProductApplication8000.class,args);
    }
}
