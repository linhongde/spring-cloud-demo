package com.hong.mapper;

import com.hong.entity.TUserRoleRelation;

public interface TUserRoleRelationMapper {
    int deleteByPrimaryKey(Integer turId);

    int insert(TUserRoleRelation record);

    int insertSelective(TUserRoleRelation record);

    TUserRoleRelation selectByPrimaryKey(Integer turId);

    int updateByPrimaryKeySelective(TUserRoleRelation record);

    int updateByPrimaryKey(TUserRoleRelation record);
}