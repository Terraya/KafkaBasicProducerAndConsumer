package com.kafka.example.notificationconsumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@Slf4j
@SpringBootApplication
public class NotificationConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationConsumerApplication.class, args);
	}

	@KafkaListener(topics = "notificationTopic")
	public void handleNotification(String message) {

		log.info("Received new Kafka entry with message: {}", message);
	}
}
