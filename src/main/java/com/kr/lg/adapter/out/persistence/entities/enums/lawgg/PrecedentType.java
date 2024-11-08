package com.kr.lg.adapter.out.persistence.entities.enums.lawgg;

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

    public static PrecedentType of(Integer code) {
        if (code != null) {
            for (PrecedentType precedentType : values()) {
                if (precedentType.getCode() == code) {
                    return precedentType;
                }
            }
        }
        return null;
    }
}
