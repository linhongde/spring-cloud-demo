package com.hong.entity;

import lombok.Data;

@Data
public class TAuth {
    private Integer trId;

    private Integer parentTrId;

    private String rightName;

    private String description;


}