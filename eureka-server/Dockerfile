FROM openjdk:8-jdk-alpine
ADD target/eureka-server-1.0-SNAPSHOT-spring-boot.jar eureka-service.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar","eureka-service.jar"]