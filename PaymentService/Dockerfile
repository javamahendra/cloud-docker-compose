FROM amazoncorretto:17

LABEL version="1.0"

EXPOSE 9092:9092

WORKDIR /app

COPY target/PaymentService-0.0.1-SNAPSHOT.jar /app/PaymentService.jar

ENTRYPOINT ["java", "-jar", "PaymentService.jar"]