FROM openjdk:8-alpine

WORKDIR /usr/app

COPY  .  /usr/app

RUN javac src/com/test/MainApp.java

CMD java -cp ./target com.test.MainApp

# To build this image: docker build -t abhisek-yadav/docker-image-java:latest .

# To create a container out of this image: docker run abhisek-yadav/docker-image-java:latest

# To check the content inside container: docker run -it  abhisek-yadav/docker-image-java:latest sh
