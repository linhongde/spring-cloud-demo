package com.hong.mapper;

import com.hong.entity.auth.TUserRightRelation;

public interface TUserRightRelationMapper {
    int deleteByPrimaryKey(Integer turId);

    int insert(TUserRightRelation record);

    int insertSelective(TUserRightRelation record);

    TUserRightRelation selectByPrimaryKey(Integer turId);

    int updateByPrimaryKeySelective(TUserRightRelation record);

    int updateByPrimaryKey(TUserRightRelation record);
}