
FROM amazoncorretto:21-alpine
WORKDIR /app

COPY target/*.jar  app.jar

EXPOSE 7575

ENTRYPOINT ["java","-jar", "app.jar"]








##########--طريقة لعمل الهوت ريلود-##########

#FROM amazoncorretto:21-alpine AS build
#WORKDIR /app
#
#COPY .mvn .mvn
#COPY mvnw .
#
#RUN chmod +x mvnw
#
#COPY pom.xml .
#RUN ./mvnw dependency:go-offline
#
#copy src ./src
#RUN ./mvnw  clean package -DskipTests
#
#EXPOSE 7575
#
#ENTRYPOINT ["./mvnw", "spring-boot:run"]
