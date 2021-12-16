FROM openjdk:8-jdk-alpine
ADD target/agency-service-1.0-SNAPSHOT-spring-boot.jar agency-service.jar
EXPOSE 8084
ENTRYPOINT ["java", "-jar","agency-service.jar"]