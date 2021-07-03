package com.hong;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.hong.mapper")
@EnableCircuitBreaker
@Slf4j
public class AuthApplication {
    //https://blog.csdn.net/j754379117/article/details/70176974
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AuthApplication.class, args);
        log.info("用户鉴权中心启动成功。。。。");
    }


}
