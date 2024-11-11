package com.kr.lg.application.domain.model;

import com.kr.lg.adapter.out.persistence.entities.ArticleEntity;
import com.kr.lg.adapter.out.persistence.entities.enums.CommentStatus;
import lombok.*;

@ToString
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class ArticleComment {

    private Long id;

    private Long articleId; // article key

    private Long userId; // 유저아이디

    private Long parentId; // 댓글 부모키

    private String password; // 패스워드 (비회원 전용)

    private String ip; // ip

    private String writer; // 작성자

    private String desc; // 디스크립션

    private Integer order; // 순번

    private Integer depth; // 댓글 depth ( 0: root, 1 ~ )

    private Integer reportCnt; // 신고수

    private CommentStatus status; // 상태 ( 0: 정상, 8: 정지, 9: 삭제)
}
