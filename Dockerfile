FROM openjdk:23-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the host machine to the container
COPY target/ems-backend-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your Spring Boot application runs on
EXPOSE 8085

# Define environment variables for the database (optional, if configured in the application.properties/yml)
ENV SPRING_DATASOURCE_URL=jdbc:mysql://mtl.mysql.database.azure.com:3306/dbOffice?createDatabaseIfNotExist=true
ENV SPRING_DATASOURCE_USERNAME=mtl
ENV SPRING_DATASOURCE_PASSWORD=ravi@123

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]