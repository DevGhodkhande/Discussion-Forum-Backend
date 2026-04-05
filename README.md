# Discussion Forum Backend

A Spring Boot backend application for a Discussion Forum that supports Users, Posts, and Comments with REST APIs.

---

## Features

- User Management (Create, View)
- Post Management (Create, View, Get by ID)
- Comment System (Linked with Users & Posts)
- Database Integration using H2
- API Testing using Postman
- Input Validation (@NotBlank, @Email)
- Global Exception Handling

---

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Lombok
- Postman (API Testing)

---

## Project Structure

com.example.demo
- controller # Handles API requests
- service # Business logic
- repository # Database access
- model # Entity classes
- exception # Global exception handling

---

## How to Run

```bash
1. Clone the repository: git clone https://github.com/DevGhodkhande/Discussion-Forum-Backend.git

2. Open IntelliJ or VS Code

3. DemoApplication.java

4. http://localhost:8080


======Sample Request======
Create Post
{
  "title": "My First Post",
  "content": "Hello backend!"
}
Create User
{
  "username": "devang",
  "email": "devang@gmail.com",
  "password": "1234"
}
Create Comment
{
  "text": "Nice post!",
  "post": { "id": 1 },
  "user": { "id": 1 }
}
