package com.hong.mapper;

import com.hong.entity.TGroup;

public interface TGroupMapper {
    int deleteByPrimaryKey(Integer tgId);

    int insert(TGroup record);

    int insertSelective(TGroup record);

    TGroup selectByPrimaryKey(Integer tgId);

    int updateByPrimaryKeySelective(TGroup record);

    int updateByPrimaryKey(TGroup record);
}