FROM maven:3.8.1-openjdk-17
LABEL "org.opencontainers.image.authors"="siyathedev.co.za"

# Set the version of the OpenTelemetry Java agent
ENV OTEL_AGENT_VERSION=1.33.5

# Download the OpenTelemetry Java agent JAR file
RUN mkdir -p /app/libs && \
    curl -L -k https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/download/v${OTEL_AGENT_VERSION}/opentelemetry-javaagent.jar -o /app/libs/opentelemetry-javaagent-${OTEL_AGENT_VERSION}.jar


COPY target/eurekaserver-service.jar eurekaserver-service.jar
ENTRYPOINT ["java", "-jar", "eurekaserver-service.jar"]