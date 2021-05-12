package com.hong.mapper;

import com.hong.entity.TAuth;

public interface TAuthMapper {
    int deleteByPrimaryKey(Integer trId);

    int insert(TAuth record);

    int insertSelective(TAuth record);

    TAuth selectByPrimaryKey(Integer trId);

    int updateByPrimaryKeySelective(TAuth record);

    int updateByPrimaryKey(TAuth record);
}