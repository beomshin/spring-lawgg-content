package com.kr.lg.adapter.in.kafka;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kr.lg.adapter.in.kafka.msg.ArticleMsg;
import com.kr.lg.application.port.in.ArticleInsertUseCase;
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

    @KafkaListener(topics = "${kafka.topic.alarm.name}", groupId = "${kafka.consumer.group-id}", containerFactory = "containerFactory")
    public void enroll(String msg, Acknowledgment ack) { // offset 커밋 조절
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            ArticleMsg article = objectMapper.readValue(msg, ArticleMsg.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
        ack.acknowledge();
    }

}
