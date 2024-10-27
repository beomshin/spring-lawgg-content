package com.kr.lg.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PrecedentType {

    WIN_PLAINTIFF(0),
    WIN_DEFENDANT(1),
    PROCESS_TRIAL(9)
    ;

    int code;

}
