package com.kr.lg.adapter.out.persistence.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kr.lg.adapter.out.persistence.entities.converter.*;
import com.kr.lg.adapter.out.persistence.entities.enums.*;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.DynamicInsert;

import java.sql.Timestamp;

@Getter
@SuperBuilder
@ToString(callSuper = true)
@Entity(name = "article_form")
@DiscriminatorValue("2")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@DynamicInsert
public class ArticleFormEntity extends ArticleEntity {

    @Column(name = "form_type")
    @Convert(converter = FormTypeConverter.class)
    private FormType formType; // 폼 타입 ( 0: 설문, 1: 퀴즈, 2: 쪽지시험 )

    @Column(name = "login_flag")
    @Convert(converter = LoginFlagConverter.class)
    private LoginFlag loginFlag; // 로그인 플래그 (0: 비로그인, 1: 로그인)

    @Column(name = "begin_dt")
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp beginDt; // 폼 시작일

    @Column(name = "end_dt")
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp endDt; // 폼 종료일

    @Column(name = "max_respondent_cnt")
    private Integer maxRespondentCnt; // 인원 제한수 ( 0: 제한 없음, 1~ 제한인원)

    @Column(name = "logo_url")
    private String logoUrl; // 로고 URL

    @Column(name = "thema_url")
    private String themaUrl; // 테마 URL

    @Column(name = "question_cnt")
    private Integer questionCnt; // 질문 개수

    @Column(name = "report_cnt")
    private Integer reportCnt; // 신고 개수

    @Column(name = "answer_cnt")
    private Integer answerCnt; // 사용자 답변 개수

    @Column(name = "status")
    @Convert(converter = FormStatusConverter.class)
    private FormStatus status; // 폼 상태 (0: 임시저장, 1: 일반 상태, 8:정지, 9: 삭제)

}
