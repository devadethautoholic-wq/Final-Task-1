# Task 1 - Spring Boot Application

## Description
This is my first Spring Boot application created using Java and Spring framework.

## Technologies Used
- Java 17
- Spring Boot 3.5.14
- Thymeleaf
- Lombok
- Maven

## How to Run
1. Clone the repository
2. Open in IntelliJ IDEA
3. Run `Task1Application.java`
4. Open browser and go to `http://localhost:8080`

## Endpoints

### GET /
Returns a simple hello message.
- **URL:** `http://localhost:8080`
- **Method:** GET
- **Response:** `Hello Vistula, in my first Spring controller.`

### GET /greeting
Returns a greeting page with a name parameter.
- **URL:** `http://localhost:8080/greeting?name=Vistula`
- **Method:** GET
- **Parameters:** `name` (optional, default = "World")
- **Response:** HTML page showing `Hello, Vistula!`

## Screenshots

### Home Page (localhost:8080)
![Home Page](screenshots/screenshotshome.png)

### Greeting Page (localhost:8080/greeting?name=Vistula)
![Greeting Page](screenshots/screenshotsgreeting.png)
