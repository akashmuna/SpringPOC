FROM openjdk:8-jdk-slim
MAINTAINER Akash Mohapatra <akash.zlatan@gmail.com>
ADD target/rabbitMQSpring.jar docker-rabbitMQSpring.jar
EXPOSE 8228
ENTRYPOINT ["java","-jar","docker-rabbitMQSpring.jar"]