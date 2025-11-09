FROM eclipse-temurin:21-jdk-alpine
WORKDIR /orderservice-app
COPY target/order-service.jar orderservice-app.jar
ENTRYPOINT ["java","-jar","orderservice-app.jar"]