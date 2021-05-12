package com.hong.mapper;

import com.hong.entity.TUserGroupRelation;

public interface TUserGroupRelationMapper {
    int deleteByPrimaryKey(Integer tugId);

    int insert(TUserGroupRelation record);

    int insertSelective(TUserGroupRelation record);

    TUserGroupRelation selectByPrimaryKey(Integer tugId);

    int updateByPrimaryKeySelective(TUserGroupRelation record);

    int updateByPrimaryKey(TUserGroupRelation record);
}