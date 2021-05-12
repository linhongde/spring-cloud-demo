package com.hong.entity;

import lombok.Data;

import java.util.Date;

@Data
public class TLog {
    private Integer logId;

    private String opType;

    private String content;

    private Integer tuId;

    private Date genTime;


}