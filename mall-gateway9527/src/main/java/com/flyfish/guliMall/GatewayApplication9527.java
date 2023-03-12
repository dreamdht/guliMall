package com.flyfish.guliMall;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @autohr flyfish
 * @date: 2023/3/10 20:12
 * @description:
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class GatewayApplication9527 {
    public static void main(String[] args) {
        log.info("9527网关服务已启动");
        SpringApplication.run(GatewayApplication9527.class,args);
    }
}
