package com.kr.lg.adapter.out.persistence.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DType {

    LAWGG_BOARD(0),
    LAWGG_TRIAL(1),
    FORMDANG_BOARD(2)
    ;

    int code;

    public static DType of(int code) {
        for (DType dType : values()) {
            if (dType.getCode() == code) {
                return dType;
            }
        }
        return null;
    }
}
