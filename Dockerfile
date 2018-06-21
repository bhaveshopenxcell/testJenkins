FROM openjdk:latest
WORKDIR /output
ADD . /app
RUN java -jar app.jar
