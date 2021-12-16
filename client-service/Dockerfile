FROM openjdk:8-jdk-alpine
ADD target/client-service-1.0-SNAPSHOT-spring-boot.jar client-service.jar
EXPOSE 8586
ENTRYPOINT ["java", "-jar","client-service.jar"]