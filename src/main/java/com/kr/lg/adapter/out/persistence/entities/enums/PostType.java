package com.kr.lg.adapter.out.persistence.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PostType {


    NORMAL_TYPE(0),
    IMAGE_TYPE(1),
    RECOMMEND(2),
    BEST_TYPE(3),
    EVENT_TYPE(98),
    NOTICE_TYPE(99),
    ;

    int code;

    public static PostType of(Integer code) {
        if (code != null) {
            for (PostType postType : values()) {
                if (postType.getCode() == code) {
                    return postType;
                }
            }
        }
        return null;
    }
}
