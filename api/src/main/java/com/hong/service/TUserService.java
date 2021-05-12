package com.hong.service;

import com.hong.common.Result;
import com.hong.entity.TUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="auth",path = "/user")
public interface TUserService {

    @PostMapping(value = "/addUser")
    Result addUser(@RequestBody TUser user);

    @PostMapping(value = "/updateUser")
    Result updateUser(@RequestBody TUser tuser);

    @PostMapping(value = "/deleteUser")
    Result deleteUser(@RequestBody TUser tUser);

    @PostMapping(value = "/selectUser")
    Result selectUser(@RequestBody TUser tUser);

    @PostMapping(value = "/getUser")
    Result getUserById(@RequestParam("id") Integer id);


}
