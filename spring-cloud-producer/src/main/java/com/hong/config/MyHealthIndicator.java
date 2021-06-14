package com.hong.config;

import com.hong.controller.Hi;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyHealthIndicator implements HealthIndicator {
    

    @Override
    public Health health() {
        if(Hi.flag){
            return new Health.Builder(Status.UP).build();
        }
        return new Health.Builder(Status.DOWN).build();
    }
}
