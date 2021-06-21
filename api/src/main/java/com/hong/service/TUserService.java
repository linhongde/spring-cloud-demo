package com.hong.service;

import com.hong.common.response.Result;
import com.hong.entity.auth.TUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="auth",path = "/user")
public interface TUserService {

    @PostMapping(value = "/addUser")
    Boolean addUser(@RequestBody TUser user);

    @PostMapping(value = "/updateUser")
    Boolean updateUser(@RequestBody TUser tuser);

    @PostMapping(value = "/deleteUser")
    Boolean deleteUser(@RequestBody TUser tUser);

    @PostMapping(value = "/selectUser")
    Result selectUser(@RequestBody TUser tUser);

    @PostMapping(value = "/getUser")
    Result getUserById(@RequestParam("id") Integer id);


}
