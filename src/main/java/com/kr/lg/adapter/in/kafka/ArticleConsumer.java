package com.kr.lg.adapter.in.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kr.lg.adapter.in.kafka.msg.ArticleCommentMsg;
import com.kr.lg.adapter.in.kafka.msg.ArticleBody;
import com.kr.lg.adapter.in.kafka.msg.ArticleMsg;
import com.kr.lg.application.port.in.ArticleInsertUseCase;
import com.kr.lg.application.port.in.command.ArticleCommentInsertCommand;
import com.kr.lg.application.port.in.command.ArticleInsertCommand;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class ArticleConsumer {

    private final ArticleInsertUseCase articleInsertUseCase;

    @KafkaListener(topics = "${kafka.topic.article.name}", groupId = "${kafka.consumer.group-id}", containerFactory = "containerFactory")
    public void enroll(String msg, Acknowledgment ack) { // offset 커밋 조절
        try {
            log.info("◆ Article 카프카 메세지 consumer 시작");
            ArticleMsg articleMsg = new ObjectMapper().readValue(msg, ArticleMsg.class);
            if (articleMsg.isArticle()) {
                articleInsertUseCase.enroll(ArticleInsertCommand.of(new ObjectMapper().convertValue(articleMsg.getBody(), ArticleBody.class)));
            } else if (articleMsg.isArticleComment()) {
                articleInsertUseCase.enrollComment(ArticleCommentInsertCommand.of(new ObjectMapper().convertValue(articleMsg.getBody(), ArticleCommentMsg.class)));
            }
            log.info("◆ Article 카프카 메세지 consumer 종료");
        } catch (Exception e) {
            log.error("", e);
        }
        ack.acknowledge();
    }

}
