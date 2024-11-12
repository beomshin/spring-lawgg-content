package com.kr.lg.adapter.in.kafka.msg;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true) // 미정의 메세지 컬럼 제외
public class ArticleMsg {

    private Header header;

    private Object body;


    @Getter
    @ToString
    @JsonIgnoreProperties(ignoreUnknown = true) // 미정의 메세지 컬럼 제외
    private static class Header {
        private Integer type; // 메세지 타입 ( 0: 로우지지 게시판 등록, 1: 로우지지 트라이얼 등록, 2 : 폼당 폼 등록)

    }

    public boolean isArticle() {
        return header.getType() >= 0 && header.getType() <= 2;
    }

    public boolean isArticleComment() {
        return header.getType() == 3;
    }

}
