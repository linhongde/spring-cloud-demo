package com.hong.mapper;

import com.hong.entity.TUser;


public interface TUserMapper {
    int deleteByPrimaryKey(Integer tuId);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer tuId);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}