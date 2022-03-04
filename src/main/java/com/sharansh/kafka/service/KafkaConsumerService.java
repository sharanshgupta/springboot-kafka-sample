package com.sharansh.kafka.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumerService
{
    @KafkaListener(topics = "first.messages",
            groupId = "group-id")
    public void consume(String message)
    {
        log.info(String.format("Message recieved -> %s", message));
    }
}
