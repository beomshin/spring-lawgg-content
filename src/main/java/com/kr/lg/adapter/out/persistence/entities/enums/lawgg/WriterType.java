package com.kr.lg.adapter.out.persistence.entities.enums.lawgg;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum WriterType {
    ANONYMOUS_TYPE(0),
    USER_TYPE(1)
    ;

    int code;

    public static WriterType of(Integer code) {
        if (code != null) {
            for (WriterType writerType : values()) {
                if (writerType.getCode() == code) {
                    return writerType;
                }
            }
        }
        return null;
    }
}
