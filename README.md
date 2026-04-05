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
Step 1: Clone the repository: git clone https://github.com/DevGhodkhande/Discussion-Forum-Backend.git

Step 2: Open IntelliJ or VS Code
Then locate src/main/java/com.example.demo/DemoApplication.java

Run: DemoApplication.java

Check: Tomcat started on port 8080

Step 3: Use Postman

Create User
POST http://localhost:8080/users
Then go to Body → raw → and paste in JSON:
{
  "username": "devang",
  "email": "devang@gmail.com",
  "password": "1234"
}

👉 Click Send

Create Post
POST http://localhost:8080/posts
Then go to Body → raw → and paste in JSON:
{
  "title": "My First Post",
  "content": "Hello backend!"
}

👉 Click Send

Create Comment
POST http://localhost:8080/comments
Then go to Body → raw → and paste in JSON:
{
  "text": "Nice post!",
  "post": { "id": 1 },
  "user": { "id": 1 }
}

👉 Click Send

GET to view data

Posts:
GET http://localhost:8080/posts
👉 Click Send

Users:
GET http://localhost:8080/users
👉 Click Send

Comments:
GET http://localhost:8080/comments
👉 Click Send

Testing error
GET http://localhost:8080/posts/999
👉 Click Send
Should show:
Post not found

=====End of File=====
