FROM maven:3.9.1-eclipse-temurin-8-alpine AS build

RUN mkdir -p /workspace

WORKDIR /workspace

COPY pom.xml /workspace

COPY src /workspace/src

RUN mvn -B package --file pom.xml -DskipTests


FROM openjdk:17-alpine3.14

COPY --from=build /workspace/target/*jar-with-dependencies.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar", "app.jar"]