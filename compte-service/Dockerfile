FROM openjdk:8-jdk-alpine
ADD target/compte-service-1.0-SNAPSHOT-spring-boot.jar compte-service.jar
EXPOSE 8387
ENTRYPOINT ["java", "-jar","compte-service.jar"]