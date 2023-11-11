FROM maven:3.6.3-jdk-11-slim AS build

RUN mkdir -p /shopconnect_service
WORKDIR /shopconnect_service
COPY /pom.xml /shopconnect_service
COPY /src /shopconnect_service/src
RUN mvn -B -f pom.xml clean package -DskipTests -Dcheckstyle.skip


FROM openjdk:11-jdk-slim
COPY --from=build /shopconnect_service/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
