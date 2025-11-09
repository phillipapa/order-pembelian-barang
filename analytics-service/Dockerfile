FROM eclipse-temurin:21-jdk-alpine
WORKDIR /analyticsservice-app
COPY target/analytics-service.jar analyticsservice-app.jar
ENTRYPOINT ["java","-jar","analyticsservice-app.jar"]