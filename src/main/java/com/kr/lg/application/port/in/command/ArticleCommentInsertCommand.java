
package com.kr.lg.application.port.in.command;

import com.kr.lg.adapter.in.kafka.msg.ArticleCommentMsg;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@ToString
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class ArticleCommentInsertCommand {

    // command 객체로 외부 어댑터에서 내부 도미엔으로 보내는 객체

    @NotNull(message = "articleId 누락")
    private Long articleId;

    private Long userId; // 유저 아이디

    private Long parentId; // 댓글 부모키

    private String ip; // ip

    private String writer; // 작성자

    private String desc; // 디스크립션

    private Integer order; // 순번

    private String password; // 패스워드



    public static ArticleCommentInsertCommand of(ArticleCommentMsg articleCommentMsg) {
        ArticleCommentInsertCommand command = ArticleCommentInsertCommand
                .builder()
                .articleId(articleCommentMsg.getArticleId())
                .userId(articleCommentMsg.getUserId())
                .parentId(articleCommentMsg.getParentId())
                .ip(articleCommentMsg.getIp())
                .writer(articleCommentMsg.getWriter())
                .desc(articleCommentMsg.getDesc())
                .order(articleCommentMsg.getOrder())
                .password(articleCommentMsg.getPassword())
                .build();

        return command;
    }
}
