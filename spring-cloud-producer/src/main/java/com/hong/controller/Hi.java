package com.hong.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hi")
public class Hi {

    public static Boolean flag=true;

    @GetMapping(value = "/changFlag")
    public void changFlag(){
        flag=false;
    }


    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String hi(){
        return "Hello Eureka !";
    }

}
