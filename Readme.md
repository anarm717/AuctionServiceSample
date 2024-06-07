# Auction Service

This is a sample auction service built with Java Spring Boot, Apache Kafka, and MongoDB. It allows users to create auction items and place bids on them. The service uses Kafka for event-driven communication and MongoDB as the database.

## Table of Contents

- [Getting Started](#getting-started)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Running the Application](#running-the-application)

## Getting Started

These instructions will guide you through setting up and running the auction service on your local machine for development and testing purposes.

## Prerequisites

- Java 11 or higher
- Apache Maven
- Docker (for running Kafka and MongoDB)
- Docker Compose

## Installation

1. **Clone the repository:**

   ```sh
   git clone https://github.com/your-username/auction-service.git
   cd auction-service
    ```
2. To run mongodb and kafka, run the following command:

   ```sh
   docker-compose up
   ```
3. To run the application, run the following command:

   ```sh
   mvn spring-boot:run
   ```
4. Swagger UI can be accessed at http://localhost:8080/swagger-ui.html
5. Create auction items and place bids using the API endpoints.