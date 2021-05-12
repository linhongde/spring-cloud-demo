package com.hong.mapper;

import com.hong.entity.TGroupRightRelation;

public interface TGroupRightRelationMapper {
    int deleteByPrimaryKey(Integer tgrId);

    int insert(TGroupRightRelation record);

    int insertSelective(TGroupRightRelation record);

    TGroupRightRelation selectByPrimaryKey(Integer tgrId);

    int updateByPrimaryKeySelective(TGroupRightRelation record);

    int updateByPrimaryKey(TGroupRightRelation record);
}