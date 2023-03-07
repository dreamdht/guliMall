package com.flyfish.guliMall.product;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @autohr flyfish
 * @date: 2023/3/7 18:07
 * @description:
 */
@SpringBootApplication
@Slf4j
public class ProductApplication8000 {
    public static void main(String[] args) {
        log.info("ProductApplication8000服务已启动");
        SpringApplication.run(ProductApplication8000.class,args);
    }
}
