package com.kr.lg.application.domain.model;

import com.kr.lg.adapter.out.persistence.entities.enums.DType;
import com.kr.lg.adapter.out.persistence.entities.enums.formdang.FormStatus;
import com.kr.lg.adapter.out.persistence.entities.enums.formdang.FormType;
import com.kr.lg.adapter.out.persistence.entities.enums.formdang.LoginFlag;
import lombok.*;

import java.sql.Timestamp;

@ToString
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class ArticleForm {

    // 도메인

    private Long userId;

    private String title;

    private String writer;

    private String desc;

    private DType dtype;

    private String ip;

    private FormType formType; // 폼 타입 ( 0: 설문, 1: 퀴즈, 2: 쪽지시험 )

    private LoginFlag loginFlag; // 로그인 플래그 (0: 비로그인, 1: 로그인)

    private Timestamp beginDt; // 폼 시작일

    private Timestamp endDt; // 폼 종료일

    private Integer maxRespondentCnt; // 인원 제한수 ( 0: 제한 없음, 1~ 제한인원)

    private String logoUrl; // 로고 URL

    private String themaUrl; // 테마 URL

    private Integer questionCnt; // 질문 개수

    private Integer reportCnt; // 신고 개수

    private Integer answerCnt; // 사용자 답변 개수

    private FormStatus status; // 폼 상태 (0: 임시저장, 1: 일반 상태, 8:정지, 9: 삭제)

}
