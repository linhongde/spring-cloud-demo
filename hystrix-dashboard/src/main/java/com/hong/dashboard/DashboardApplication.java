package com.hong.dashboard;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@Log
@EnableHystrixDashboard
@EnableEurekaClient
public class DashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(DashboardApplication.class);
        log.info("Hystrix 数据监控服务启动成功。。。。。");
    }

}
