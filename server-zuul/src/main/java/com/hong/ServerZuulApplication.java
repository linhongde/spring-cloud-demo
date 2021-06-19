package com.hong;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@Slf4j
public class ServerZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerZuulApplication.class);
        log.info("server-zuul启动成功。。。。。。");
    }
}
