package com.flyfish.guliMall.coupon;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @autohr flyfish
 * @date: 2023/3/7 17:34
 * @description:
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class CouponApplication5000 {
    public static void main(String[] args) {
        log.info("CouponApplication5000服务已启动");
        SpringApplication.run(CouponApplication5000.class,args);
    }
}
