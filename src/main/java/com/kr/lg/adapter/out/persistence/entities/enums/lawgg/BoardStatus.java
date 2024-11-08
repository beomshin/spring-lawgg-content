package com.kr.lg.adapter.out.persistence.entities.enums.lawgg;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BoardStatus {

    NORMAL_STATUS(0),
    REPORT_STATUS(8),
    DELETE_STATUS(9),

    ;

    int code;

}
