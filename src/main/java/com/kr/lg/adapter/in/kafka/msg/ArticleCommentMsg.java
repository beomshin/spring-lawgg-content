package com.kr.lg.adapter.in.kafka.msg;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true) // 미정의 메세지 컬럼 제외
public class ArticleCommentMsg {

    private Long articleId;

    private Long userId; // 유저 아이디

    private Long parentId; // 댓글 부모키

    private String ip; // ip

    private String writer; // 작성자

    private String desc; // 디스크립션

    private Integer order; // 순번

    private String password; // 패스워드
}
