# Spring Security Authentication API

## Overview
This project implements a **secure Spring Boot REST API** using **Spring Security** with in-memory authentication.  
It demonstrates how backend APIs are protected at the framework level before requests reach the controller layer.

The application follows **industry-standard security practices** and is designed to be easily extensible to **JWT-based stateless authentication**.

---

## Key Features
- Spring Security filter-based request protection
- Public and secured REST endpoints
- In-memory user authentication
- BCrypt password hashing
- Centralized security configuration using `SecurityFilterChain`
- Clean separation of controller and security layers

---

## Technology Stack
- Java
- Spring Boot
- Spring Security
- BCrypt Password Encoder

---

## API Endpoints

### Public Endpoint
```

GET /public

```
- Accessible without authentication

---

### Secured Endpoint
```

GET /secure

```
- Requires authentication
- Blocked if credentials are missing or invalid

---

## Authentication Details

### User Configuration
The application uses an in-memory user store for authentication.

| Field     | Value     |
|----------|-----------|
| Username | jay       |
| Password | password  |
| Role     | USER      |

Passwords are securely stored using **BCrypt hashing**.

---

## How Security Works
1. Incoming requests are intercepted by Spring Security filters
2. Authentication is performed before controller execution
3. User credentials are validated using `UserDetailsService` and `PasswordEncoder`
4. Authorized requests are forwarded to the controller
5. Unauthorized requests are rejected with proper HTTP status codes

---

## HTTP Status Codes
- **200 OK** → Request authenticated successfully
- **401 Unauthorized / 403 Forbidden** → Authentication failed or missing

---

## Testing Instructions

### Access Public Endpoint
```

GET [http://localhost:8080/public](http://localhost:8080/public)

```

### Access Secured Endpoint (Using Postman)
- Authorization Type: **Basic Auth**
- Username: `jay`
- Password: `password`

```

GET [http://localhost:8080/secure](http://localhost:8080/secure)

```

---

## Project Structure
```

src/main/java
└── com.example.authdemo
├── controller
│   └── HelloController.java
└── config
└── SecurityConfig.java

```

---

## Future Enhancements
- JWT-based stateless authentication
- Role-based authorization
- Database-backed user authentication

---

## Professional Summary
This project demonstrates practical experience in securing REST APIs using Spring Security, including authentication flow, password hashing, and request-level access control.
```

