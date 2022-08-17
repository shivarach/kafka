package com.example.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

//    Consumer 1
    @KafkaListener(topics = "greeting", groupId = "group1")
    public void listenGroup1(String message) {
        System.out.println("Received Message in group1: " + message);
    }
// Consumer 2
    @KafkaListener(topics = "greeting", groupId = "group2")
    public void listenGroup2(String message) {
        System.out.println("Received Message in group2: " + message);
    }
}
