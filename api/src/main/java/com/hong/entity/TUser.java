package com.hong.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("用户实体类")
public class TUser {

    @ApiModelProperty("唯一标识ID")
    private Integer tuId;

    @ApiModelProperty("所属组织")
    private Integer toId;

    @ApiModelProperty("登录帐号")
    private String loginName;

    @ApiModelProperty("用户密码")
    private String password;

    @ApiModelProperty("用户姓名")
    private String username;

    @ApiModelProperty("手机号")
    private String mobile;

    @ApiModelProperty("电子邮箱")
    private String email;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("登录时间")
    private Date loginTime;

    @ApiModelProperty("上次登录时间")
    private Date lastLoginTime;

    @ApiModelProperty("登录次数")
    private Integer count;


}