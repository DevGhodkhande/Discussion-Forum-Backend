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
{Note: You can find the cloned file in C:\Users\(Username)}

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
{
  "username": "tech_sam",
  "email": "sam.tech@example.com",
  "password": "samPass456"
}
{
  "username": "coder_riya",
  "email": "riya.codes@example.com",
  "password": "riyaPass789"
}

👉 Click Send

Create Post
POST http://localhost:8080/posts
Then go to Body → raw → and paste in JSON:
{
  "title": "My First Post",
  "content": "Hello backend!"
}
{
  "title": "How to start with Spring Boot?",
  "content": "I am new to Spring Boot. Can someone guide me with resources and best practices?"
}
{
  "title": "Difference between JPA and Hibernate",
  "content": "Can someone explain the difference between JPA and Hibernate in simple terms?"
}
{
  "title": "Best way to learn backend development",
  "content": "What roadmap should I follow to become a backend developer?"
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
{
  "text": "Start with official Spring docs and build small projects!",
  "post": { "id": 2 },
  "user": { "id": 2 }
}
{
  "text": "JPA is a specification, Hibernate is its implementation.",
  "post": { "id": 3 },
  "user": { "id": 3 }
}
{
  "text": "Focus on Java, Spring Boot, and databases first.",
  "post": { "id": 4 },
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
