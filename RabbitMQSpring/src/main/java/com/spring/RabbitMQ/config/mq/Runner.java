package com.spring.RabbitMQ.config.mq;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.RabbitMQ.helper.SpringRabbitMqApplication;

@Component
public class Runner implements CommandLineRunner {

	private final RabbitTemplate rabbitTemplate;
	private final Receiver receiver;
	private final static Logger logger = LoggerFactory.getLogger(Runner.class);
	
	@Autowired
	private SpringRabbitMqApplication springRabbitMqApplication;

	public Runner(Receiver receiver, RabbitTemplate rabbitTemplate) {
		this.receiver = receiver;
		this.rabbitTemplate = rabbitTemplate;
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Sending message...");
		rabbitTemplate.convertAndSend(springRabbitMqApplication.topicExchangeName, "foo.bar.baz",
				"Hello from RabbitMQ!");
		receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
	}

}
