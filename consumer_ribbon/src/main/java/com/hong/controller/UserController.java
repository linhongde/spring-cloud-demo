package com.hong.controller;

import com.hong.common.response.Result;
import com.hong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public Result getUser(@RequestParam(value = "id")Integer id){
        return userService.getUser(id);
    }

    @GetMapping(value = "/getUserById")
    public Result getUserById(@RequestParam(value = "id")Integer userId){
        return userService.getUserById(userId);
    }
}
