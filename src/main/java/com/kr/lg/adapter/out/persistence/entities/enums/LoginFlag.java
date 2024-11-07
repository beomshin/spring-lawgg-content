package com.kr.lg.adapter.out.persistence.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum LoginFlag {

    SURVEY(0),
    QUIZ(1),
    PAPER_TEST(2)
    ;

    int code;

    public static LoginFlag of(Integer code) {
        if (code != null) {
            for (LoginFlag dType : values()) {
                if (dType.getCode() == code) {
                    return dType;
                }
            }
        }
        return null;
    }
}
