package com.hong.controller;

import com.hong.common.response.Result;
import com.hong.entity.AuthUser;
import com.hong.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@Slf4j
@Api(tags = "用户管理")
@RestController
@RequestMapping(value = "/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("保存用户信息")
    @PostMapping(value = "/saveUser")
    public Result<Boolean> saveUser(@RequestBody AuthUser authUser){
        return null;
    }

    @ApiOperation("根据用户ID删除用户信息")
    @GetMapping(value = "/deleteUser")
    public Result deleteUser(@PathParam("id")Long userId){
        return Result.ok(true);
    }

    @ApiOperation("修改用户信息")
    @PostMapping(value = "/updateUser")
    public Result updateUser(@RequestBody AuthUser authUser){
        return null;
    }

    @ApiOperation("根据用户ID获取用户信息")
    @GetMapping(value = "/getUserById")
    public Result getUserById(@PathParam(value = "id")Long userId){
        return null;
    }

    @ApiOperation("根据用户名称获取用户信息")
    @GetMapping(value = "/getUserByUserName")
    public Result getUserByUserName(@PathParam(value = "name")String UserName){
        return null;
    }
}
