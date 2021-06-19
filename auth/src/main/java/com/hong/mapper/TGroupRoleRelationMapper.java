package com.hong.mapper;

import com.hong.entity.auth.TGroupRoleRelation;

public interface TGroupRoleRelationMapper {
    int deleteByPrimaryKey(Integer tgrId);

    int insert(TGroupRoleRelation record);

    int insertSelective(TGroupRoleRelation record);

    TGroupRoleRelation selectByPrimaryKey(Integer tgrId);

    int updateByPrimaryKeySelective(TGroupRoleRelation record);

    int updateByPrimaryKey(TGroupRoleRelation record);
}