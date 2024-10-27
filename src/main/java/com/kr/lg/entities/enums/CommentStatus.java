package com.kr.lg.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CommentStatus {

    NORMAL_STATUS(0),
    REPORT_STATUS(8),
    DELETE_STATUS(9),

    ;

    int code;

}
