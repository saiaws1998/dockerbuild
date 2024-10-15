# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-alpine

# set shell to bash
RUN yum update && yum add bash

# Set the working directory to /app
WORKDIR /app

# Copy the fat jar into the container at /app
COPY /target/springcore.jar /app

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run jar file when the container launches
CMD ["java", "-jar", "springcore.jar"]
