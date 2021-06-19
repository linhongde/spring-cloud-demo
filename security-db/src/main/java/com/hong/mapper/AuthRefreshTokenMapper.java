package com.hong.mapper;

import com.hong.entity.AuthRefreshToken;

public interface AuthRefreshTokenMapper {
    int insert(AuthRefreshToken record);

    int insertSelective(AuthRefreshToken record);
}