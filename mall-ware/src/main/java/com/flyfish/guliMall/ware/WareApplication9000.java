package com.flyfish.guliMall.ware;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @autohr flyfish
 * @date: 2023/3/7 18:17
 * @description:
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class WareApplication9000 {
    public static void main(String[] args) {
        log.info("WareApplication9000服务已启动");
        SpringApplication.run(WareApplication9000.class,args);
    }
}
