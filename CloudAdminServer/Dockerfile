FROM amazoncorretto:17

LABEL version="1.0"

EXPOSE 1111:1111

WORKDIR /app

COPY target/CloudAdminServer-0.0.1-SNAPSHOT.jar /app/CloudAdminServer.jar

ENTRYPOINT ["java", "-jar", "CloudAdminServer.jar"]