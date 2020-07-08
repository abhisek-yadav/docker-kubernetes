FROM openjdk:8-jdk-alpine
#FROM maven:3.6.0-alpine

WORKDIR /usr/app

COPY ./target/spring-dockercompose-example-0.0.1-SNAPSHOT.jar /usr/app

CMD java -jar  spring-dockercompose-example-0.0.1-SNAPSHOT.jar

# To build an Docker Image for this docker file: docker build -t abhisek-yadav/spring-dockercompose-example .

# To create container out of this image:  docker run -p 8080:8080 abhisek-yadav/spring-dockercompose-example:latest