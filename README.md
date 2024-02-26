# Spring Boot Microservices with API Gateway, PostgreSQL, Zipkin, Config Server, and Eureka Discovery Server

## Overview

This repository contains a set of Spring Boot microservices designed for managing student and school information. The project includes separate microservices for students and schools, an API Gateway to manage requests, a PostgreSQL database for data storage, Zipkin for distributed tracing, a Config Server for centralized configuration, and Eureka Discovery Server for service discovery.

## Microservices

### 1. Student Microservice

- Manages student information.
- CRUD operations for students.
- Communicates with the PostgreSQL database.

### 2. School Microservice

- Manages school information.
- CRUD operations for schools.
- Communicates with the PostgreSQL database.

## API Gateway

- Manages and routes incoming requests to the appropriate microservices.
- Centralized entry point for communication with the microservices.

## Database

- PostgreSQL database is used for persistent storage of student and school information.

## Config Server

- Centralized configuration server for microservices.
- Manages configuration properties for each microservice.

## Eureka Discovery Server

- Service discovery server to locate and register microservices.
- Enables dynamic scaling and load balancing.

## Zipkin

- Distributed tracing system for monitoring and debugging microservices.
- Captures and displays timing data to identify bottlenecks in the system.

## Prerequisites

- Java 8 or higher
- Maven
- PostgreSQL
- Zipkin Server
- Eureka Discovery Server
