# Spring Security JWT Authentication API

## Overview
This project implements a **Spring Boot REST API secured with JWT-based authentication** using **Spring Security**.
It demonstrates how authentication is handled in a **stateless backend system** using a login endpoint, JWT issuance, and a custom authentication filter.

The application follows **real-world backend security practices** and is designed to be **interview-ready**.

---

## Key Features
- Login API that authenticates users and issues JWT
- Stateless authentication using JSON Web Tokens (JWT)
- Custom JWT Authentication Filter
- JWT generation, validation, and username extraction
- Spring Security integration with AuthenticationManager
- In-memory user authentication (for learning/demo)
- Secured endpoints accessible only with valid JWT

---

## Technology Stack
- Java 17
- Spring Boot 3.x
- Spring Security 6
- JJWT (0.12.x)
- BCrypt Password Encoder
- Maven

---

## Authentication Flow (JWT)

1. Client sends **username and password** to the login API
2. Spring Security authenticates credentials using `AuthenticationManager`
3. Server generates a **signed JWT**
4. Client sends JWT in every request using:
```

Authorization: Bearer <JWT>

```
5. JWT Authentication Filter:
- Validates the token
- Extracts the username
- Loads user details
- Sets authentication in `SecurityContext`
6. Secured endpoints are accessible only after successful JWT validation

---

## API Endpoints

### Login (Public)
```

POST /auth/login

````

**Request Body**
```json
{
  "username": "Jay",
  "password": "Password"
}
````

**Response**

```
<JWT_TOKEN>
```

---

### Secured Endpoint (Example)

```
GET /secure
Authorization: Bearer <JWT_TOKEN>
```

---

## JWT Utility

JWT-related logic is encapsulated in a dedicated utility class.

```
JwtUtil
├── generateToken(username)
├── extractUsername(token)
└── validateToken(token)
```

Responsibilities:

* Token creation with expiry
* Signature validation (HS256)
* Username extraction from claims

---

## Security Components

* **AuthenticationManager**
  Handles credential authentication during login

* **UserDetailsService**
  Loads user details (in-memory for demo)

* **JWT Authentication Filter**
  Validates JWT for every request before reaching controllers

* **SecurityContextHolder**
  Stores authenticated user information per request

---

## HTTP Status Codes

* **200 OK** → Authentication successful
* **401 Unauthorized** → Missing or invalid JWT
* **403 Forbidden** → Access denied to secured resource

---

## Project Structure

```
src/main/java/com/example/security
├── AuthController.java
├── JwtAuthenticationFilter.java
├── JwtUtil.java
├── LoginRequest.java
├── SecurityConfig.java
```

---

## Notes

* This project uses **in-memory users** for simplicity
* JWT secret key length follows RFC standards for HS256
* No server-side sessions are used (fully stateless)

---

## Purpose

This project demonstrates **practical backend security skills** using Spring Boot and JWT, including:

* Secure login implementation
* Token-based authentication
* Filter-based request security
* Clean separation of responsibilities

---

## Status

✔ Login API implemented
✔ JWT utility implemented
✔ JWT authentication filter implemented
✔ Stateless security configuration
⬜ Role-based authorization (future enhancement)

```


