package com.flyfish.guliMall.member;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @autohr flyfish
 * @date: 2023/3/7 17:38
 * @description:
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.flyfish.guliMall.member.feign")
public class MemberApplication6001 {
    public static void main(String[] args) {
        log.info("MemberApplication6000已启动");
        SpringApplication.run(MemberApplication6001.class,args);
    }
}
