package com.kr.lg.adapter.out.persistence.entities.enums.formdang;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FormType {

    SURVEY(0),
    QUIZ(1),
    PAPER_TEST(2)
    ;

    int code;

    public static FormType of(Integer code) {
        if (code != null) {
            for (FormType dType : values()) {
                if (dType.getCode() == code) {
                    return dType;
                }
            }
        }
        return null;
    }
}
