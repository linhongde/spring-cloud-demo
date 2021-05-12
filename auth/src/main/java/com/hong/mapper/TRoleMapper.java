package com.hong.mapper;

import com.hong.entity.TRole;

public interface TRoleMapper {
    int deleteByPrimaryKey(Integer trId);

    int insert(TRole record);

    int insertSelective(TRole record);

    TRole selectByPrimaryKey(Integer trId);

    int updateByPrimaryKeySelective(TRole record);

    int updateByPrimaryKey(TRole record);
}