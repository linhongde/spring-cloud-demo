package com.hong.service;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("spring-cloud-producer")
public interface HiService {
    @GetMapping("/hi/hi")
    String hi();
}
