package com.hong.entity;

import lombok.Data;

import java.util.Date;

@Data
public class TRole {
    private Integer trId;

    private Integer parentTrId;

    private String roleName;

    private Date greateTime;

    private String description;


}