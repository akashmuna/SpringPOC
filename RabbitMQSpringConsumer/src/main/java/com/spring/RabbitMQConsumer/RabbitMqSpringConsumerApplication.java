package com.spring.RabbitMQConsumer;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitMqSpringConsumerApplication {

	public static void main(String[] args) {
		final SpringApplication app = new SpringApplication(RabbitMqSpringConsumerApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}

}
