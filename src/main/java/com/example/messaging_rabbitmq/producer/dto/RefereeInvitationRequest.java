package com.example.messaging_rabbitmq.producer.dto;

import java.time.LocalDate;

public record RefereeInvitationRequest(
        String email,
        String refereeName,
        String tournamentName,
        LocalDate startDate,
        LocalDate endDate,
        String location){}
