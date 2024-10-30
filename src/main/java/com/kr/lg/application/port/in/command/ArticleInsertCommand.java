package com.kr.lg.application.port.in.command;

import com.kr.lg.adapter.in.kafka.msg.ArticleMsg;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class ArticleInsertCommand {

    // command 객체로 외부 어댑터에서 내부 도미엔으로 보내는 객체

    private Long userId;

    private String title;

    private String writer;

    private String desc;

    private Integer dtype;

    private String ip;


    public static ArticleInsertCommand of(ArticleMsg articleMsg) {
        return ArticleInsertCommand
                .builder()
                .userId(articleMsg.getUserId())
                .title(articleMsg.getTitle())
                .writer(articleMsg.getWriter())
                .desc(articleMsg.getDesc())
                .dtype(articleMsg.getDtype())
                .ip(articleMsg.getIp())
                .build();
    }
}
