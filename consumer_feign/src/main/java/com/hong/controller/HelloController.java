package com.hong.controller;

import com.hong.service.HiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hi")
public class HelloController {

    @Resource
    private HiService hiService;

    @GetMapping("/hello")
    public String hello(){
        return hiService.hi();
    }


}
