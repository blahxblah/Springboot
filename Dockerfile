FROM eclipse-temurin:17-jdk-alpine

ARG VER
ARG STG

ENV APP_VER=$VER
ENV APP_STG=$STG

COPY "build/libs/Springboot-${APP_VER}-SNAPSHOT.jar" app.jar
#COPY "build/libs/dmarioweb-0.0.6.jar" app.jar

ENTRYPOINT ["java","-Dspring.profiles.active=${APP_STG}", "-jar","/app.jar"]
#ENTRYPOINT ["java","-Dspring.profiles.active=dev", "-jar","/app.jar"]
