package com.hong;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@Slf4j
@EnableEurekaClient
@EnableOAuth2Sso
public class AuthWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthWebApplication.class);
        log.info("auth-web启动成功。。。。。。");
    }
}
