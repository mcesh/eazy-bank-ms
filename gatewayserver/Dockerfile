FROM maven:3.8.1-openjdk-17
LABEL "org.opencontainers.image.authors"="siyathedev.co.za"
COPY target/gatewaysever-service.jar gatewaysever-service.jar
ENTRYPOINT ["java", "-jar", "eurekaserver-service.jar"]