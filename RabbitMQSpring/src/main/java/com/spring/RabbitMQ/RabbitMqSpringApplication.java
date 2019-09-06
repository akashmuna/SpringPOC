package com.spring.RabbitMQ;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitMqSpringApplication {

	public static void main(String[] args) {
		final SpringApplication app = new SpringApplication(RabbitMqSpringApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}

}
