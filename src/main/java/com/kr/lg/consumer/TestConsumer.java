package com.kr.lg.consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class TestConsumer {

    @KafkaListener(topics = "${kafka.topic.alarm.name}", groupId = "${kafka.consumer.group-id}", containerFactory = "kafkaListenerContainerFactory")
    public void acknowledge(String data, Acknowledgment ack) {
        log.info("{}", data);
        ack.acknowledge();
    }


}
