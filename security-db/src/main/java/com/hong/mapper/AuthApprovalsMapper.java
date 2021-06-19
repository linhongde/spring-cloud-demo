package com.hong.mapper;

import com.hong.entity.AuthApprovals;

public interface AuthApprovalsMapper {
    int insert(AuthApprovals record);

    int insertSelective(AuthApprovals record);
}