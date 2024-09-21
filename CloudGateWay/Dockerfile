FROM amazoncorretto:17

LABEL version="1.0"

EXPOSE 8762:8762

WORKDIR /app

COPY target/CloudGateWay-0.0.1-SNAPSHOT.jar /app/CloudGateWay.jar

ENTRYPOINT ["java", "-jar", "CloudGateWay.jar"]