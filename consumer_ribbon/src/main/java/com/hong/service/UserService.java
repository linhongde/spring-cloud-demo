package com.hong.service;

import com.hong.common.response.Result;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    final String APPLICATION_NAME="auth";

    @Autowired
    private RestTemplate restTemplate;


    /**
     * 熔断器使用线程隔离策略
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "getUserError",
            commandKey = "getUser",
            groupKey = "SelectUser",
            threadPoolKey = "user",
            threadPoolProperties ={
            @HystrixProperty(name="coreSize",value = "10")})
    public Result getUser(Integer id){
        log.info("收到请求："+Thread.currentThread().getName());
        MultiValueMap<String,Integer> propertyValues=new LinkedMultiValueMap<>();
        propertyValues.add("id",id);
        return restTemplate.postForObject("http://"+APPLICATION_NAME+"/user/getUser",propertyValues,Result.class);
    }


    /**
     * 熔断器使用信号量隔离
     * @param id
     * @return
     */
    @HystrixCommand(
            fallbackMethod = "getUserError",commandProperties={
            @HystrixProperty(name = "execution.isolation.strategy",value = "SEMAPHORE"),
            @HystrixProperty(name = "execution.isolation.semaphore.maxConcurrentRequests",value = "10")
    }
    )
    public Result getUserById(Integer id){
        log.info("收到请求："+Thread.currentThread().getName());
        MultiValueMap<String,Integer> propertyValues=new LinkedMultiValueMap<>();
        propertyValues.add("id",id);
        return restTemplate.postForObject("http://"+APPLICATION_NAME+"/user/getUser",propertyValues,Result.class);
    }







    private Result getUserError(Integer id){
        log.info("收到请求："+Thread.currentThread().getId());
        return Result.error("降级处理");
    }



}
