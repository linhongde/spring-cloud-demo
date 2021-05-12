package com.hong.mapper;

import com.hong.entity.TOrganization;

public interface TOrganizationMapper {
    int deleteByPrimaryKey(Integer toId);

    int insert(TOrganization record);

    int insertSelective(TOrganization record);

    TOrganization selectByPrimaryKey(Integer toId);

    int updateByPrimaryKeySelective(TOrganization record);

    int updateByPrimaryKey(TOrganization record);
}