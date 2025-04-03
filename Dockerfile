# Use the official OpenJDK image as the base image
FROM amazoncorretto:21-alpine as base

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot JAR file into the container
COPY target/springboot-shopping-cart-images.jar /app/springboot-shopping-cart-images.jar

# Expose the port your Spring Boot application will run on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/app/springboot-shopping-cart-images.jar"]
