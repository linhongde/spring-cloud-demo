package com.hong.mapper;

import com.hong.entity.OauthRole;
import com.hong.entity.OauthRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OauthRoleMapper {
    int countByExample(OauthRoleExample example);

    int deleteByExample(OauthRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OauthRole record);

    int insertSelective(OauthRole record);

    List<OauthRole> selectByExample(OauthRoleExample example);

    OauthRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OauthRole record, @Param("example") OauthRoleExample example);

    int updateByExample(@Param("record") OauthRole record, @Param("example") OauthRoleExample example);

    int updateByPrimaryKeySelective(OauthRole record);

    int updateByPrimaryKey(OauthRole record);
}