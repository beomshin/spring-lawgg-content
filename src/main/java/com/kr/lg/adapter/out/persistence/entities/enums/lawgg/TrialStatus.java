package com.kr.lg.adapter.out.persistence.entities.enums.lawgg;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TrialStatus {

    NORMAL_STATUS(0),
    END_STATUS(1),
    UPLOAD_STATUS(2),
    UPLOAD_FAIL_STATUS(3),
    LIVE_STATUS(4),
    REPORT_STATUS(8),
    DELETE_STATUS(9)
    ;

    int code;

}
