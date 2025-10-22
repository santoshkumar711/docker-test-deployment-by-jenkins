FROM openjdk:17

COPY  target/Docker.jar Dockerapp.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "Dockerapp.jar"]
