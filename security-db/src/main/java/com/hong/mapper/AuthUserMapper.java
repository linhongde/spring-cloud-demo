package com.hong.mapper;

import com.hong.entity.AuthUser;

import java.util.List;

public interface AuthUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AuthUser record);

    int insertSelective(AuthUser record);

    AuthUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AuthUser record);

    int updateByPrimaryKey(AuthUser record);

    AuthUser selectByUserName(String userName);

    List<AuthUser> listAuthUser(AuthUser authUser);
}