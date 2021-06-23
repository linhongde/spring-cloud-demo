package com.hong;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@Slf4j
public class AuthServerApplication {
    //https://blog.csdn.net/qq_20042935/article/details/103582431
    //https://blog.csdn.net/m0_37661458/article/details/106608430
    public static void main(String[] args) {
        SpringApplication.run(AuthServerApplication.class);
        log.info("auth-server启动成功。。。。。。");
    }
}
