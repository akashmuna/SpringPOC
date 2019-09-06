package com.spring.RabbitMQConsumer.helper;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {

	@RabbitListener(queues = "${spring-boot-exchange.rabbitmq.queue}")
	public void recievedMessage(String message) {
		System.out.println("Recieved Message From RabbitMQ: " + message);
	}
}