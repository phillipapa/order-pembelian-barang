FROM eclipse-temurin:21-jdk-alpine
WORKDIR /inventoryservice-app
COPY target/inventory-service.jar inventoryservice-app.jar
ENTRYPOINT ["java","-jar","inventoryservice-app.jar"]