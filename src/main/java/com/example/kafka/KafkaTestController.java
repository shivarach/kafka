package com.example.kafka;

import com.example.kafka.config.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class KafkaTestController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping
    public void produceMessage(@RequestParam String topic, @RequestParam Greeting greeting) {
        kafkaProducer.send(topic, greeting);
    }
}
