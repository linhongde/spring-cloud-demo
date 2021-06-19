package com.hong.mapper;

import com.hong.entity.OauthUser;
import com.hong.entity.OauthUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OauthUserMapper {
    int countByExample(OauthUserExample example);

    int deleteByExample(OauthUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OauthUser record);

    int insertSelective(OauthUser record);

    List<OauthUser> selectByExample(OauthUserExample example);

    OauthUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OauthUser record, @Param("example") OauthUserExample example);

    int updateByExample(@Param("record") OauthUser record, @Param("example") OauthUserExample example);

    int updateByPrimaryKeySelective(OauthUser record);

    int updateByPrimaryKey(OauthUser record);
}