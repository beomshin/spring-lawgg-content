package com.kr.lg.adapter.out.persistence.entities.enums.formdang;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FormStatus {

    TEMPORARY_STATUS(0), // 임시상태
    NORMAL_STATUS(1), // 일반 상태
    REPORT_STATUS(8), // 정지 상태
    DELETE_STATUS(9), // 삭제 상태

    ;

    int code;

}
