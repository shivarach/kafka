package com.example.kafka;

import com.example.kafka.config.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
	}

	@Autowired
	private KafkaProducer kafkaProducer;


	@Override
	public void run(String... args) throws Exception {
		for (int i = 0; i < 5; i++) {
			Thread.sleep(1000);
			kafkaProducer.send("greeting", new Greeting("Good morning!", "Shiva" + i ));
		}
	}
}
