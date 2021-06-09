package com.hong.controller;

import com.hong.common.Result;
import com.hong.entity.TUser;
import com.hong.service.TUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

@RestController
@RequestMapping(value = "/user")
@Api(tags = "用户管理")
public class UserController {

    @Resource
    private TUserService userService;

    @PostMapping("/addUser")
    @ApiOperation(value = "添加用户信息")
    public Result addUser(@RequestBody TUser user){
        return userService.addUser(user);
    }


    @PostMapping("/selectUser")
    @ApiOperation(value = "查询用户信息")
    public Result selectUser(@RequestBody TUser user){
        return userService.selectUser(user);
    }


    @PostMapping("updateUser")
    @ApiOperation(value = "修改用户信息")
    public Result updateUser(@RequestBody TUser user){
        return userService.updateUser(user);
    }


    @PostMapping("deleteUser")
    @ApiOperation(value = "删除用户信息")
    public Result deleteUser(@RequestBody TUser user){
        return userService.deleteUser(user);
    }

    @PostMapping("/getUser")
    @ApiOperation("根据用户ID获取用户信息")
    public Result getUserById(@RequestParam("id")Integer id){
        return userService.getUserById(id);
    }

}
