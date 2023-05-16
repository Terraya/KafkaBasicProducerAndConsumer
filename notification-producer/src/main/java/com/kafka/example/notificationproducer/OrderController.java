package com.kafka.example.notificationproducer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping
    public void SendServiceCall(@RequestBody final String messageToWrite) {

        log.info("Received following message to write: {}", messageToWrite);

        kafkaTemplate.send("notificationTopic", messageToWrite);
    }
}
