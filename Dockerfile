FROM openjdk:17-alpine3.14

WORKDIR /workspace

COPY ./target/*.jar /workspace/app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar", "/workspace/app.jar"]