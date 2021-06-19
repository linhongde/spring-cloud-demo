package com.hong.service.impl;

import com.hong.common.response.Result;
import com.hong.entity.auth.TUser;
import com.hong.mapper.TUserMapper;
import com.hong.service.TUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TUserServiceImpl implements TUserService {

    @Resource
    private TUserMapper mapper;

    @Override
    public Result addUser(TUser tUser) {
        Integer result=mapper.insert(tUser);
        if(result==1){
            return Result.success(result);
        }
        return Result.fail("添加用户信息失败");
    }

    @Override
    public Result updateUser(TUser tuser) {
        Integer result=mapper.insertSelective(tuser);
        if (result==1){
            return Result.success(result);
        }
        return Result.fail("修改用户信息失败。");
    }

    @Override
    public Result deleteUser(TUser tUser) {
        Integer result=mapper.deleteByPrimaryKey(tUser.getTuId());
        if (result==1){
            return Result.success(result);
        }
        return Result.fail("删除用户信息失败。");
    }

    @Override
    public Result selectUser(TUser tUser) {
        return Result.success(mapper.selectByPrimaryKey(tUser.getTuId()));
    }

    @Override
    public Result getUserById(Integer id) {
        return Result.success(mapper.selectByPrimaryKey(id));
    }
}
