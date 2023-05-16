package com.kafka.example.notificationproducer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OrderPlacedEvent {

    private String message;

}
