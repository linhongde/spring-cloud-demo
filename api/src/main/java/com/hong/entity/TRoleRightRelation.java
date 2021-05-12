package com.hong.entity;

import lombok.Data;

@Data
public class TRoleRightRelation {
    private Integer trrId;

    private Integer roleId;

    private Integer rightId;

    private String rightType;


}