package com.hong.mapper;

import com.hong.entity.OauthClientToken;
import com.hong.entity.OauthClientTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OauthClientTokenMapper {
    int countByExample(OauthClientTokenExample example);

    int deleteByExample(OauthClientTokenExample example);

    int deleteByPrimaryKey(String authenticationId);

    int insert(OauthClientToken record);

    int insertSelective(OauthClientToken record);

    List<OauthClientToken> selectByExampleWithBLOBs(OauthClientTokenExample example);

    List<OauthClientToken> selectByExample(OauthClientTokenExample example);

    OauthClientToken selectByPrimaryKey(String authenticationId);

    int updateByExampleSelective(@Param("record") OauthClientToken record, @Param("example") OauthClientTokenExample example);

    int updateByExampleWithBLOBs(@Param("record") OauthClientToken record, @Param("example") OauthClientTokenExample example);

    int updateByExample(@Param("record") OauthClientToken record, @Param("example") OauthClientTokenExample example);

    int updateByPrimaryKeySelective(OauthClientToken record);

    int updateByPrimaryKeyWithBLOBs(OauthClientToken record);

    int updateByPrimaryKey(OauthClientToken record);
}