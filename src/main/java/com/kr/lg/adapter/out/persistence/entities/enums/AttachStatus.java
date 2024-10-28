package com.kr.lg.adapter.out.persistence.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AttachStatus {

    NORMAL_STATUS(0),
    DELETE_STATUS(9),
    ;

    int code;

}
