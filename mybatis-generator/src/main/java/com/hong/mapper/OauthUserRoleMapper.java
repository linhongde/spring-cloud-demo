package com.hong.mapper;

import com.hong.entity.OauthUserRole;
import com.hong.entity.OauthUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OauthUserRoleMapper {
    int countByExample(OauthUserRoleExample example);

    int deleteByExample(OauthUserRoleExample example);

    int insert(OauthUserRole record);

    int insertSelective(OauthUserRole record);

    List<OauthUserRole> selectByExample(OauthUserRoleExample example);

    int updateByExampleSelective(@Param("record") OauthUserRole record, @Param("example") OauthUserRoleExample example);

    int updateByExample(@Param("record") OauthUserRole record, @Param("example") OauthUserRoleExample example);
}