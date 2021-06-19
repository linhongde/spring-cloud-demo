package com.hong.entity.auth;

import lombok.Data;

import java.util.Date;

@Data
public class TGroup {
    private Integer tgId;

    private String groupName;

    private String parentTgId;

    private Date genTime;

    private String description;


}