# Use the OpenJDK image with JDK
FROM openjdk:11-slim

# Set the working directory
WORKDIR /app

# Copy the project files
COPY . /app

# Make the Gradle wrapper executable
RUN chmod +x ./gradlew

# Compile the Java code
RUN ./gradlew build

# Run the application
CMD ["java", "-jar", "build/libs/payment-service-1.0-SNAPSHOT.jar"]