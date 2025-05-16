package com.example.messaging_rabbitmq.producer;


import com.example.messaging_rabbitmq.producer.dto.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
public class ProducerController {

    private final Producer producer;
    private static final String EMAIL = "tournamentappio@gmail.com";

    public ProducerController(Producer producer) {
        this.producer = producer;
    }

    @GetMapping("/send/inv")
    public String sendMessage() {

        RefereeInvitationRequest message = new RefereeInvitationRequest(
                EMAIL, "", "test", LocalDate.of(2000, 10, 10),
                LocalDate.of(2020, 12, 20), "test"
                );
        String routingKey = "referee-invitation";
        producer.sendMessage(routingKey, message);
        return "Message sent: " + message;
    }

    @GetMapping("/send/conf")
    public String sendMessage2() {

        RegistrationRequest message = new RegistrationRequest(
                EMAIL, "", "test", LocalDate.of(2000, 10, 10),
                "test"
        );
        String routingKey = "registration-confirmation";
        producer.sendMessage2(routingKey, message);
        return "Message sent: " + message;
    }

    @GetMapping("/send/schedule")
    public String sendMessage3() {

        ScheduleRequest message =
                new ScheduleRequest(
                        EMAIL,
                        "John Doe",
                        "Spring Cup 2025",
                        "Warsaw, Sportowa Street 12",
                        List.of(
                                new ScheduleEvent(
                                        LocalDateTime.of(2025, 4, 15, 10, 0),
                                        EventType.GROUP_MATCH,
                                        "Team B")));
        String routingKey = "schedule";
        producer.sendMessage3(routingKey, message);
        return "Message sent: " + message;
    }

    @GetMapping("/send/restore")
    public String sendMessage4() {

        AccountRestoreDto message = new AccountRestoreDto(
                EMAIL,
                "TOKEN"
        );
        String routingKey = "account-restore";
        producer.sendMessage4(routingKey, message);
        return "Message sent: " + message;
    }
}