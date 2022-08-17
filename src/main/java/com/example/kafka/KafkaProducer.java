package com.example.kafka;

import com.example.kafka.config.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, Greeting> kafkaTemplate;

    public void send(String topic, Greeting payload) {
        kafkaTemplate.send(topic, payload);
    }
}
