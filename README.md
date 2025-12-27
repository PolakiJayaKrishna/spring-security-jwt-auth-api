# Spring Security JWT Authentication API

## Overview
This project implements a **secure Spring Boot REST API** using **Spring Security** with **JWT-based authentication utilities**.  
It demonstrates how backend APIs handle token generation, validation, and identity extraction before requests reach secured endpoints.

The application follows **industry-standard security practices** and forms the foundation for **stateless authentication using JWT**.

---

## Key Features
- Spring Security–based request protection
- JWT token generation and validation
- Username extraction from JWT claims
- Token expiration handling
- Centralized JWT utility component
- Clean separation of security and controller layers

---

## Technology Stack
- Java 17
- Spring Boot
- Spring Security
- JJWT (JSON Web Token)
- BCrypt Password Encoder

---

## JWT Details

### Token Generation
- JWT is generated after successful authentication
- Token contains:
  - subject (username)
  - issued time
  - expiration time
- Token is signed using **HMAC-SHA256**

---

### Token Validation
- Incoming JWT tokens are:
  - verified using a server-side secret key
  - checked for expiration
  - rejected if invalid or modified

---

### Claim Extraction
- Username is extracted from the standard JWT `sub` (subject) claim
- This value is later used for authentication and authorization logic

---

## JWT Utility

JWT-related logic is encapsulated inside a dedicated utility class.

```

JwtUtil
├── generateToken(username)
├── extractUsername(token)
└── validateToken(token)

```

This approach ensures reusable, maintainable, and testable JWT handling.

---

## HTTP Status Codes
- **200 OK** → Token validated successfully
- **401 Unauthorized / 403 Forbidden** → Invalid, expired, or missing token

---

## Project Structure
```

src/main/java
└── com.example.security
├── JwtUtil.java
├── SecurityConfig.java
└── HelloController.java

```

---

## Future Enhancements
- Login API to issue JWT tokens
- JWT authentication filter
- Role-based authorization
- Database-backed user authentication

---

## Professional Summary
This project demonstrates practical experience in implementing **JWT-based authentication** using Spring Boot and Spring Security, including token creation, validation, and secure claim handling.
```
---
