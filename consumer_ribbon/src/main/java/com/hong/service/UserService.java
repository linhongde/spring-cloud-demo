package com.hong.service;

import com.hong.common.Result;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    final String APPLICATION_NAME="auth";

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getUserError",
            threadPoolProperties ={
            @HystrixProperty(name="coreSize",value = "5")})
    public Result getUser(Integer id){
        MultiValueMap<String,Integer> propertyValues=new LinkedMultiValueMap<>();
        propertyValues.add("id",id);
        return restTemplate.postForObject("http://"+APPLICATION_NAME+"/user/getUser",propertyValues,Result.class);
    }

    private Result getUserError(Integer id){
        return Result.error("降级处理");
    }



}
