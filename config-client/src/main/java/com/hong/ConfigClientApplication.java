package com.hong;

import lombok.extern.slf4j.Slf4j;
<<<<<<< HEAD
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
=======
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> e4abaa59b663f3f3a764bda91816453ef8bca3b3

@Slf4j
@SpringBootApplication
@EnableEurekaClient
<<<<<<< HEAD
=======
@RestController
>>>>>>> e4abaa59b663f3f3a764bda91816453ef8bca3b3
public class ConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class);
        log.info("配置中心客户端启动成功。。。。。。");
    }

<<<<<<< HEAD
=======
    @Value("${env.name}")
    private String bar;

    @RequestMapping("/app")
    String hello() {
        return "Hello " + bar + "!";
    }
>>>>>>> e4abaa59b663f3f3a764bda91816453ef8bca3b3

}
