package com.example.messaging_rabbitmq.producer.dto;

import java.util.List;

public record ScheduleRequest(
        String email,
        String participantName,
        String tournamentName,
        String location,
        List<ScheduleEvent> schedule){}