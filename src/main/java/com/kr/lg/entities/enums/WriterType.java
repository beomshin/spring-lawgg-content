package com.kr.lg.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum WriterType {
    ANONYMOUS_TYPE(0),
    USER_TYPE(1)
    ;

    int code;

}
