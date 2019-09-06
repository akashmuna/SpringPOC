FROM openjdk:8-jdk-slim
MAINTAINER Akash Mohapatra <akash.zlatan@gmail.com>
ADD target/RabbitMQSpringConsumer.jar docker-rabbitMQSpringConsumer.jar
EXPOSE 8223
ENTRYPOINT ["java","-jar","docker-rabbitMQSpringConsumer.jar"]