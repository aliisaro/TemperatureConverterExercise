
FROM maven:latest
LABEL authors="aliis"
WORKDIR /app
COPY pom.xml /app/
COPY . /app/
RUN mvn package
CMD ["java", "-jar", "target/converter.jar"]