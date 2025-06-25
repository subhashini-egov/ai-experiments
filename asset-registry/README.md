# Asset Registry Application

This Spring Boot application implements the endpoints defined in `asset-registry-1.0.0.yaml` using PostgreSQL.

## Requirements
- Java 17
- Maven
- Lombok (annotation processing enabled in your IDE)
- PostgreSQL 14 running locally with a database named `assetdb`
- Environment variables `DB_USERNAME` and `DB_PASSWORD` providing database credentials

## Running the application

```
cd asset-registry
mvn spring-boot:run
```

Before running, export the database credentials:

```
export DB_USERNAME=postgres
export DB_PASSWORD=postgres
```

The service listens on port `8080`.

## Continuous Integration

The GitHub Actions workflow uses secrets `DB_USERNAME` and `DB_PASSWORD` to
provide database credentials at build time. Configure these secrets in your
repository settings before running the workflow.
