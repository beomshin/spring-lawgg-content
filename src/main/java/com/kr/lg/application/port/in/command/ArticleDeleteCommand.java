package com.kr.lg.application.port.in.command;

import com.kr.lg.adapter.in.kafka.msg.ArticleBody;
import lombok.*;

@ToString
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ArticleDeleteCommand {

    public static ArticleDeleteCommand of(ArticleBody articleBody) {
        return ArticleDeleteCommand.builder()
                .build();
    }
}
