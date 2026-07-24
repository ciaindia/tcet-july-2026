# Employee Management System

## Overview
This is a full-stack CRUD application containing a Spring Boot backend and a React Vite frontend. 

The application utilizes JSON Web Tokens (JWT) for secure authentication. 

## Structure
- `fsdapp/`: The Spring Boot Backend Application.
  - Exposes RESTful endpoints at `/api/employees` and `/api/auth`.
  - Configured with Spring Security and JWT.
  - Automatically provisions the `users` and `employee` tables via Hibernate on the configured MySQL database.
  - Interactive Swagger Documentation is available at: `http://localhost:8081/swagger-ui.html`

- `frontend/`: The React Application built with Vite.
  - Contains full views for Login, Register, and a Dashboard.
  - Starts up a dev server at `http://localhost:5173`.
  
## How to Run

### Backend
1. Ensure MySQL is running and matches the credentials in `application.properties`.
2. Navigate to `fsdapp/` and run:
   ```bash
   ./mvnw spring-boot:run
   ```
3. The server will start on port `8081`. 

### Frontend
1. Navigate to `frontend/` and install dependencies (if you haven't):
   ```bash
   npm install
   ```
2. Start the dev server:
   ```bash
   npm run dev
   ```
3. Open `http://localhost:5173` in your browser.

## Authentication
To access the system:
1. Click **Register** on the frontend to create a new user. 
   - Alternatively, a default `admin` user with password `admin@123#` is automatically created for you.
2. Login to receive your JWT token.
3. Access the Dashboard and manage your employees!
