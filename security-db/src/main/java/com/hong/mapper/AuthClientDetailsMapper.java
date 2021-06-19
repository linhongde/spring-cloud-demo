package com.hong.mapper;

import com.hong.entity.AuthClientDetails;

public interface AuthClientDetailsMapper {
    int deleteByPrimaryKey(String clientId);

    int insert(AuthClientDetails record);

    int insertSelective(AuthClientDetails record);

    AuthClientDetails selectByPrimaryKey(String clientId);

    int updateByPrimaryKeySelective(AuthClientDetails record);

    int updateByPrimaryKey(AuthClientDetails record);
}