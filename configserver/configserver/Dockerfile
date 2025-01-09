FROM maven:3.8.1-openjdk-17
LABEL "org.opencontainers.image.authors"="siyathedev.co.za"
COPY target/configserver-service.jar configserver-service.jar
ENTRYPOINT ["java", "-jar", "configserver-service.jar"]