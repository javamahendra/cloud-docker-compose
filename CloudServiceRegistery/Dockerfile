FROM amazoncorretto:17

LABEL version="1.0"

EXPOSE 8761:8761

WORKDIR /app

COPY target/CloudServiceRegistery-0.0.1-SNAPSHOT.jar /app/CloudServiceRegistery.jar

ENTRYPOINT ["java", "-jar", "CloudServiceRegistery.jar"]