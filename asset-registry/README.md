# Asset Registry Application

This Spring Boot application implements the endpoints defined in `asset-registry-1.0.0.yaml` using PostgreSQL.

## Requirements
- Java 17
- Maven
- Lombok (annotation processing enabled in your IDE)
- PostgreSQL 14 running locally with a database named `assetdb` and user/password `postgres`

## Running the application

```
cd asset-registry
mvn spring-boot:run
```

The service listens on port `8080`.
