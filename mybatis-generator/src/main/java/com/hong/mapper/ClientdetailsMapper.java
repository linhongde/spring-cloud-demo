package com.hong.mapper;

import com.hong.entity.Clientdetails;
import com.hong.entity.ClientdetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClientdetailsMapper {
    int countByExample(ClientdetailsExample example);

    int deleteByExample(ClientdetailsExample example);

    int deleteByPrimaryKey(String appid);

    int insert(Clientdetails record);

    int insertSelective(Clientdetails record);

    List<Clientdetails> selectByExample(ClientdetailsExample example);

    Clientdetails selectByPrimaryKey(String appid);

    int updateByExampleSelective(@Param("record") Clientdetails record, @Param("example") ClientdetailsExample example);

    int updateByExample(@Param("record") Clientdetails record, @Param("example") ClientdetailsExample example);

    int updateByPrimaryKeySelective(Clientdetails record);

    int updateByPrimaryKey(Clientdetails record);
}