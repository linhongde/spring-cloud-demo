package com.hong.mapper;

import com.hong.entity.AuthClientToken;

public interface AuthClientTokenMapper {
    int deleteByPrimaryKey(String authenticationId);

    int insert(AuthClientToken record);

    int insertSelective(AuthClientToken record);

    AuthClientToken selectByPrimaryKey(String authenticationId);

    int updateByPrimaryKeySelective(AuthClientToken record);

    int updateByPrimaryKeyWithBLOBs(AuthClientToken record);

    int updateByPrimaryKey(AuthClientToken record);
}