FROM openjdk:8-jdk-alpine
ADD target/employe-service-1.0-SNAPSHOT-spring-boot.jar employe-service.jar
EXPOSE 8587
ENTRYPOINT ["java", "-jar","employe-service.jar"]