package com.kr.lg.adapter.out.persistence.entities.enums.lawgg;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum LineType {

    TOP(0),
    JUNGLE(1),
    MID(2),
    ADD(3),
    SPT(4)
    ;

    int code;

    public static LineType of(Integer code) {
        if (code != null) {
            for (LineType lineType : values()) {
                if (lineType.getCode() == code) {
                    return lineType;
                }
            }
        }
        return null;
    }
}
