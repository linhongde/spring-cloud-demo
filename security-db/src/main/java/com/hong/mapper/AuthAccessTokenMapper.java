package com.hong.mapper;

import com.hong.entity.AuthAccessToken;
import com.hong.entity.AuthAccessTokenWithBLOBs;

public interface AuthAccessTokenMapper {
    int deleteByPrimaryKey(String authenticationId);

    int insert(AuthAccessTokenWithBLOBs record);

    int insertSelective(AuthAccessTokenWithBLOBs record);

    AuthAccessTokenWithBLOBs selectByPrimaryKey(String authenticationId);

    int updateByPrimaryKeySelective(AuthAccessTokenWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AuthAccessTokenWithBLOBs record);

    int updateByPrimaryKey(AuthAccessToken record);
}