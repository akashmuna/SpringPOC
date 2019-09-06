package com.spring.RabbitMQConsumer.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {

	private final static Logger logger = LoggerFactory.getLogger(RabbitMQConsumer.class);
	
	@RabbitListener(queues = "${spring-boot-exchange.rabbitmq.queue}")
	public void recievedMessage(String message) {
		logger.info("Recieved Message From RabbitMQ: " + message);
	}
}