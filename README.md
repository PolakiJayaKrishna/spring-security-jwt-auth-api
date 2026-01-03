# Spring Security JWT Authentication API 🔐

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2-brightgreen)
![Spring Security](https://img.shields.io/badge/Spring%20Security-6-green)
![JWT](https://img.shields.io/badge/Auth-JWT-yellow)
![Build](https://img.shields.io/badge/Build-Maven-blue)
![Status](https://img.shields.io/badge/Project-Completed-success)

This project demonstrates **JWT-based authentication** using **Spring Boot 3**
and **Spring Security 6**, focusing on **stateless security** and a
**custom JWT authentication filter**.

---

## 🚀 Features

- JWT-based stateless authentication
- Login API that issues JWT tokens
- Custom JWT authentication filter
- Public and secured REST endpoints
- Password encryption using BCrypt
- Modern Spring Security 6 configuration
- End-to-end testing using Postman

---

## 🛠️ Tech Stack

| Technology        | Version     |
|------------------|-------------|
| Java             | 17          |
| Spring Boot      | 3.2.x       |
| Spring Security  | 6.x         |
| JWT              | jjwt 0.12.x |
| Build Tool       | Maven       |
| API Testing      | Postman     |

---

## 📂 Project Structure

src/main/java/com/example/security
├── AuthController
├── HelloController
├── JwtAuthenticationFilter
├── JwtUtil
├── LoginRequest
├── SecurityConfig
└── SpringSecurityJwtAuthApiApplication



---

## 🔐 Authentication Flow

1. User sends credentials to `/auth/login`
2. Credentials are authenticated using `AuthenticationManager`
3. JWT token is generated and returned
4. Client sends JWT in `Authorization: Bearer <token>` header
5. `JwtAuthenticationFilter` validates the token
6. `SecurityContext` is populated
7. Request is allowed to secured endpoints

---

## 🌐 API Endpoints

### 🔓 Public Endpoints

| Method | Endpoint       | Description            |
|------:|---------------|------------------------|
| POST  | /auth/login   | Login and get JWT      |
| GET   | /public       | Public endpoint        |

### 🔒 Secured Endpoints

| Method | Endpoint | Description                 |
|------:|----------|-----------------------------|
| GET   | /secure  | Requires valid JWT token    |

---

## 🧪 API Testing (Postman Proof)

### 1️⃣ Login API – Generate JWT (POST /auth/login)

```json
{
  "username": "Jay",
  "password": "Password"
}


2️⃣ Access Secure API WITHOUT Token (GET /secure)

Expected Result: 403 Forbidden

3️⃣ Access Secure API WITH Token (GET /secure)

Header:

Authorization: Bearer <JWT_TOKEN>


Expected Result: 200 OK

4️⃣ Access Public API (GET /public)

Expected Result: 200 OK

⚙️ Security Configuration Highlights

CSRF disabled

HTTP Basic authentication disabled

Form Login disabled

Stateless session management (SessionCreationPolicy.STATELESS)

Custom JWT filter registered before UsernamePasswordAuthenticationFilter

🧠 Key Concepts Implemented

Authentication vs Authorization

Stateless authentication using JWT

Spring Security filter chain

Custom OncePerRequestFilter

JWT structure (Header, Payload, Signature)

Circular dependency debugging and resolution

▶️ How to Run the Project
git clone https://github.com/PolakiJayaKrishna/spring-security-jwt-auth-api.git
cd spring-security-jwt-auth-api
mvn spring-boot:run


Application runs at:

http://localhost:8080

📌 Project Status
Feature	Status
Login API	✅ Done
JWT Generation	✅ Done
JWT Validation	✅ Done
Stateless Security	✅ Done
Secured Endpoints	✅ Done
Postman Testing	✅ Done
👤 Author

Polaki Jaya Krishna
Final-year B.Tech Student
Java | Spring Boot | Spring Security | JWT