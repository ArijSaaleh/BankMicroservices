FROM openjdk:8-jdk-alpine
ADD target/zuul-gateway-2.1.9.RELEASE.jar zuul-service.jar
EXPOSE 8763
ENTRYPOINT ["java", "-jar","zuul-service.jar"]