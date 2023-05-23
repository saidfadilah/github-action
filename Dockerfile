#FROM maven:3.9.2-eclipse-temurin-17-alpine AS build
#
#RUN mkdir -p /workspace
#
#WORKDIR /workspace
#
#COPY pom.xml /workspace
#
#COPY src /workspace/src
#
#RUN mvn -B package --file pom.xml -DskipTests


FROM openjdk:17-alpine3.14
WORKDIR /workspace

#COPY --from=build /workspace/target/githu. app.jar
COPY ./target/github-action-0.0.1-SNAPSHOT.jar /workspace/app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar", "/workspace/app.jar"]