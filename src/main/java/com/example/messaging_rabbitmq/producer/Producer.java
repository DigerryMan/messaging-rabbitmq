package com.example.messaging_rabbitmq.producer;

import com.example.messaging_rabbitmq.producer.dto.AccountRestoreDto;
import com.example.messaging_rabbitmq.producer.dto.RefereeInvitationRequest;
import com.example.messaging_rabbitmq.producer.dto.RegistrationRequest;
import com.example.messaging_rabbitmq.producer.dto.ScheduleRequest;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {

    private final RabbitTemplate rabbitTemplate;
    static final String topicExchangeName = "direct-exchange";

    public Producer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(String routingKey, RefereeInvitationRequest object) {
        rabbitTemplate.convertAndSend(topicExchangeName, routingKey, object);
        System.out.println("Sent: " + object);
    }

    public void sendMessage2(String routingKey, RegistrationRequest object) {
        rabbitTemplate.convertAndSend(topicExchangeName, routingKey, object);
        System.out.println("Sent: " + object);
    }

    public void sendMessage3(String routingKey, ScheduleRequest object) {
        rabbitTemplate.convertAndSend(topicExchangeName, routingKey, object);
        System.out.println("Sent: " + object);
    }

    public void sendMessage4(String routingKey, AccountRestoreDto object) {
        rabbitTemplate.convertAndSend(topicExchangeName, routingKey, object);
        System.out.println("Sent: " + object);
    }
}
