package com.example.messaging_rabbitmq.producer.dto;

import java.time.LocalDate;

public record RegistrationRequest(
        String email,
        String participantName,
        String tournamentName,
        LocalDate tournamentStartDate,
        String location){}