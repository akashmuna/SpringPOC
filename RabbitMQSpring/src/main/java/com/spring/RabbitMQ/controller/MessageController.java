package com.spring.RabbitMQ.controller;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.TimeUnit;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.RabbitMQ.config.mq.Receiver;
import com.spring.RabbitMQ.helper.SpringRabbitMqApplication;

@RestController
public class MessageController {
	
	private final static Logger logger = LoggerFactory.getLogger(MessageController.class);

	@Autowired
	private RabbitTemplate rabbitTemplate;
	@Autowired
	private Receiver receiver;
	@Autowired
	private SpringRabbitMqApplication springRabbitMqApplication;

	@PostMapping("/messages")
	public String sendMessage(@Valid @RequestBody String message) {

		rabbitTemplate.convertAndSend(springRabbitMqApplication.topicExchangeName, "foo.bar.baz",
				message);
		
		try {
			receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			StringWriter sw = new StringWriter();
	        e.printStackTrace(new PrintWriter(sw));
	        logger.error("Error Message : "+ sw.toString());
		}

		return "Message added to the queue : " + message;
	}

}