# Use the Maven image with JDK
FROM maven:3.8.4-openjdk-11-slim AS build

# Set the working directory
WORKDIR /app

# Copy the project files
COPY . /app

# Compile the Java code using Maven
RUN mvn clean package

# Use a smaller OpenJDK image for the runtime
FROM openjdk:11-jre-slim

# Set the working directory
WORKDIR /app

# Copy the built jar file from the build stage
COPY --from=build /app/target/payment-service-1.0-SNAPSHOT.jar /app/payment-service-1.0-SNAPSHOT.jar

# Run the application
CMD ["java", "-jar", "payment-service-1.0-SNAPSHOT.jar"]