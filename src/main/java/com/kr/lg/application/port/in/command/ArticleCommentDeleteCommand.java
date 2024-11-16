
package com.kr.lg.application.port.in.command;

import com.kr.lg.adapter.in.kafka.msg.ArticleBody;
import jakarta.validation.Valid;
import lombok.*;


@ToString
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class ArticleCommentDeleteCommand {

    // command 객체로 외부 어댑터에서 내부 도미엔으로 보내는 객체

    public static @Valid ArticleCommentDeleteCommand of(ArticleBody articleBody) {
        return ArticleCommentDeleteCommand.builder()
                .build();
    }

}