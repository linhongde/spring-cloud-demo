package com.hong.mapper;

import com.hong.entity.auth.TLog;

public interface TLogMapper {
    int deleteByPrimaryKey(Integer logId);

    int insert(TLog record);

    int insertSelective(TLog record);

    TLog selectByPrimaryKey(Integer logId);

    int updateByPrimaryKeySelective(TLog record);

    int updateByPrimaryKey(TLog record);
}