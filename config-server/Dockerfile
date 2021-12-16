FROM openjdk:8-jdk-alpine
ADD target/config-server-1.0-SNAPSHOT-spring-boot.jar config-server.jar
EXPOSE 8888
ENTRYPOINT ["java", "-jar","config-server.jar"]