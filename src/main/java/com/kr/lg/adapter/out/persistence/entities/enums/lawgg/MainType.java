package com.kr.lg.adapter.out.persistence.entities.enums.lawgg;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MainType {

    NORMAL_TYPE(0),
    MAIN_TYPE(1)
    ;

    int code;

    public static MainType of(Integer code) {
        if (code != null) {
            for (MainType mainType : values()) {
                if (mainType.getCode() == code) {
                    return mainType;
                }
            }
        }
        return null;
    }
}
