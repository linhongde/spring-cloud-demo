package com.hong;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@Slf4j
@EnableAdminServer
@EnableEurekaClient
public class SpringBootAdmin {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdmin.class);
        log.info("spring-boot-admin启动成功。。。。。。");
    }

}
