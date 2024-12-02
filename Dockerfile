FROM maven AS builder
WORKDIR /app
COPY . .
RUN ./mvnw javadoc:javadoc
RUN ./mvnw clean package -DskipTests
FROM eclipse-temurin
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
