# Hello!! This is a spring boot app!

This app is simple. It connects to a postgres database and says if the database works.

Requirements:
- Java 21

## Commands
The following commands should help you build and test your application.
### Build the app
```bash
./mvnw clean package
```

### Build the app without running tests
```bash
./mvnw clean package -DskipTests
```

### Test the app
```bash
./mvnw test
```

### Run the app locally
```bash
./mvnw spring-boot:run
```

