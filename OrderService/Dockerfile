FROM amazoncorretto:17

LABEL version="1.0"

EXPOSE 9091:9091

WORKDIR /app

COPY target/OrderService-0.0.1-SNAPSHOT.jar /app/OrderService.jar

ENTRYPOINT ["java", "-jar", "OrderService.jar"]