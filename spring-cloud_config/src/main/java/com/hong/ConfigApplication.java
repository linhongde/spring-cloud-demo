package com.hong;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Slf4j
@EnableEurekaClient
@EnableConfigServer
@RestController
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class);
        log.info("配置中心启动成功${server.port}");
    }


   /* @Value("${spring.cloud.config.name}")
    private String port;

    @GetMapping("/getPort")
    public String getPort() {
        return port;

    }*/
}
