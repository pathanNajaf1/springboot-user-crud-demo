# Spring Boot JPA User Demo

This is a small backend project I built while learning Spring Boot and Spring Data JPA.

The goal of the project was to understand how a Spring Boot application connects to a MySQL database and performs basic CRUD operations using a repository.

## What this project does

- Connects a Spring Boot application to a MySQL database
- Uses Spring Data JPA for database operations
- Defines a `User` entity
- Saves multiple users to the database
- Fetches users by ID
- Updates existing user records

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## Project Structure

```
src/main/java/com/jpa/test
 ├── Bootjpaexample1Application.java
 ├── dao
 │   └── UserRepository.java
 └── entities
     └── User.java
```

## Example User Entity

```
User
 ├── id
 ├── name
 ├── city
 └── status
```

## What I learned from this project

- How Spring Boot starts and manages the application context
- How to connect Spring Boot with MySQL
- How repositories work in Spring Data JPA
- How to insert, fetch, and update records using JPA

## Future Improvements

Some things I plan to add next:

- REST API endpoints using `@RestController`
- API testing with Postman
- A service layer between controller and repository
- Proper exception handling

## Author

Built by me while learning Spring Boot.
