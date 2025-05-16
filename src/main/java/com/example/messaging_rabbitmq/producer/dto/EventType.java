package com.example.messaging_rabbitmq.producer.dto;

public enum EventType {
    GROUP_MATCH("Group Match"),
    SEMI_FINAL("Semi-Final Match"),
    FINAL("Final Match");

    private final String message;

    EventType(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}