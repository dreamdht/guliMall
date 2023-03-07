package com.flyfish.guliMall.member;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @autohr flyfish
 * @date: 2023/3/7 17:38
 * @description:
 */
@SpringBootApplication
@Slf4j
public class MemberApplication6000 {
    public static void main(String[] args) {
        log.info("MemberApplication6000已启动");
        SpringApplication.run(MemberApplication6000.class,args);
    }
}
