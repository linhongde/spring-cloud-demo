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
    public Boolean addUser(TUser tUser) {
        Integer result=mapper.insert(tUser);
        return result==1?true:false;
    }

    @Override
    public Boolean updateUser(TUser tuser) {
        Integer result=mapper.insertSelective(tuser);
        return result==1?true:false;
    }

    @Override
    public Boolean deleteUser(TUser tUser) {
        Integer result=mapper.deleteByPrimaryKey(tUser.getTuId());
        return result==1?true:false;
    }

    @Override
    public Result selectUser(TUser tUser) {
        return Result.ok(mapper.selectByPrimaryKey(tUser.getTuId()));
    }

    @Override
    public Result getUserById(Integer id) {
        return Result.ok(mapper.selectByPrimaryKey(id));
    }
}
