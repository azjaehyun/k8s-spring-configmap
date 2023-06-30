# Use the official JDK 17 base image
FROM amazoncorretto:17.0.7-alpine


# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot application JAR file to the container
COPY build/libs/k8s-spring-configmap-0.0.1-SNAPSHOT.jar .

# Expose the port on which the Spring Boot application will run
EXPOSE 8080

# Set the entry point command to run the Spring Boot application
CMD ["java", "-jar", "k8s-spring-configmap-0.0.1-SNAPSHOT.jar"]

