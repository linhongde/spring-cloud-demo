package com.hong.mapper;

import com.hong.entity.TRoleRightRelation;

public interface TRoleRightRelationMapper {
    int deleteByPrimaryKey(Integer trrId);

    int insert(TRoleRightRelation record);

    int insertSelective(TRoleRightRelation record);

    TRoleRightRelation selectByPrimaryKey(Integer trrId);

    int updateByPrimaryKeySelective(TRoleRightRelation record);

    int updateByPrimaryKey(TRoleRightRelation record);
}