package com.hong.mapper;

import com.hong.entity.AuthCode;

public interface AuthCodeMapper {
    int insert(AuthCode record);

    int insertSelective(AuthCode record);
}