package com.hong.mapper;

import com.hong.entity.auth.TRole;

public interface TRoleMapper {
    int deleteByPrimaryKey(Integer trId);

    int insert(TRole record);

    int insertSelective(TRole record);

    TRole selectByPrimaryKey(Integer trId);

    int updateByPrimaryKeySelective(TRole record);

    int updateByPrimaryKey(TRole record);
}