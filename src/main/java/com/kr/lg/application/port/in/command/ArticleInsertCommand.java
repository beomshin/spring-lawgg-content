package com.kr.lg.application.port.in.command;

import com.kr.lg.adapter.in.kafka.msg.ArticleMsg;
import com.kr.lg.adapter.out.persistence.entities.enums.LineType;
import com.kr.lg.adapter.out.persistence.entities.enums.PostType;
import com.kr.lg.adapter.out.persistence.entities.enums.WriterType;
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

    private Long lawFirmId;

    private String password;

    private PostType postType;

    private WriterType writerType;

    private LineType lineType;


    public static ArticleInsertCommand of(ArticleMsg articleMsg) {
        return ArticleInsertCommand
                .builder()
                .userId(articleMsg.getUserId())
                .title(articleMsg.getTitle())
                .writer(articleMsg.getWriter())
                .desc(articleMsg.getDesc())
                .dtype(articleMsg.getDtype())
                .ip(articleMsg.getIp())
                .lawFirmId(articleMsg.getLawFirmId())
                .password(articleMsg.getPassword())
                .postType(PostType.getInstance(articleMsg.getPostType()))
                .writerType(WriterType.getInstance(articleMsg.getWriterType()))
                .lineType(LineType.getInstance(articleMsg.getLineType()))
                .build();
    }
}
