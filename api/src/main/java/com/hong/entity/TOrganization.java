package com.hong.entity;

import lombok.Data;

import java.util.Date;

@Data
public class TOrganization {
    private Integer toId;

    private Integer parentToId;

    private String orgName;

    private Date genTime;

    private String description;


}