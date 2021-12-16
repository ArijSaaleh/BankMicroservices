FROM openjdk:8-jdk-alpine
ADD target/credit-service-1.0-SNAPSHOT-spring-boot.jar credit-service1.jar
EXPOSE 8183
ENTRYPOINT ["java", "-jar","credit-service1.jar"]