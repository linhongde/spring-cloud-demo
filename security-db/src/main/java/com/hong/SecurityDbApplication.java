package com.hong;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;

//注解开启资源服务，因为程序需要对外暴露获取token的API和验证token的API所以该程序也是一个资源服务器。
//@EnableResourceServer
@SpringBootApplication
@EnableEurekaClient
@Slf4j
@MapperScan("com.hong.mapper")
public class SecurityDbApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecurityDbApplication.class);
        log.info("security-db启动成功。。。。。。");
    }
}
