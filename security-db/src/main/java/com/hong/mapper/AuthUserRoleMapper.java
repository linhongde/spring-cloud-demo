package com.hong.mapper;

import com.hong.entity.AuthUserRole;

public interface AuthUserRoleMapper {
    int insert(AuthUserRole record);

    int insertSelective(AuthUserRole record);
}