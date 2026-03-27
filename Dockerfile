# Use a maintained OpenJDK distribution
FROM eclipse-temurin:23-jdk

# Copy the pre-built JAR file from your local target directory
ADD ./app/build/libs/app.jar ./app.jar

# Expose the port your Spring app runs on (default 8080)
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]