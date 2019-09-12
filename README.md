# SpringPOC - (RabbitMQ + Spring boot Integration)

This is a Spring Boot MicroService(Consumer, Producer) + RabbitMQ implemented application in which 
RabbitMQSpring act as a Producer to send the messages to RabbitMQ while RabbitMQSpringConsumer act as a consumer which consumes the messages shared by Producer

The Application uses docker RabbitMQ configuration and also Swagger to send the messages using the microservice RabbitMQSpring.

##RabbitMQSpring

This microservice acts as a Producer as well as the first consumer to make use of the messages shared to the Queue (spring-boot)

##RabbitMQSpringConsumer

This microservice act as a Consumer to consume the messages shared to the Queue (spring-boot) present in the Rabbit MQ

##RabbitMQ

RabbitMQ is lightweight and easy to deploy on premises and in the cloud. It supports multiple messaging protocols. RabbitMQ can be deployed in distributed and federated configurations to meet high-scale, high-availability requirements. 

We are using the [RabbitMQ](https://www.rabbitmq.com/#getstarted) deployed on [docker hub](https://hub.docker.com/_/rabbitmq).

### How to run the service:

1. Git Clone 

    ```bash
    https://github.com/akashmuna/SpringPOC.git
    ```
2. Maven build

    ```bash
    mvn clean package
	```
3. Run docker-compose

	```bash
	cd RabbitMQSpring
	docker-compose up
	```

### Endpoints

Local System Endpoints:

	http://localhost:8228/swagger-ui.html
