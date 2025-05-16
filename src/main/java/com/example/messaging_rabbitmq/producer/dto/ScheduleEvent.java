package com.example.messaging_rabbitmq.producer.dto;

import java.time.LocalDateTime;

public record ScheduleEvent(LocalDateTime dateTime, EventType eventType, String opponent){}