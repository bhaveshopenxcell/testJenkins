FROM openjdk:latest
WORKDIR /build/libs/
ADD . /app
RUN java -jar app.jar
