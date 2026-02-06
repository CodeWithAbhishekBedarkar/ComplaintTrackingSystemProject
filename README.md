# Complaint Tracking System Project

A **Complaint Tracking System** is a web-based application designed to register, track, and manage customer complaints efficiently. The system allows users to submit complaints, view their status, and enables administrators to update, resolve, and monitor complaints through a structured workflow.

This project is suitable for organizations like municipalities, service providers, colleges, or corporate helpdesks.

---

## 📌 Features

* User complaint registration
* Complaint categorization (Water, Electricity, Internet, etc.)
* Real-time complaint status tracking
* Admin complaint management
* CRUD operations using REST APIs
* Exception handling & validations
* API testing using Postman

---

## 🛠️ Tech Stack

### Backend

* **Java**
* **Spring Boot**
* **Spring Data JPA (Hibernate)**
* **RESTful Web Services**
* **Lombok**
* **Maven**

### Database

* **MySQL**

### Tools & IDE

* **Eclipse IDE**
* **Apache Tomcat**
* **Postman (API Testing)**
* **Git & GitHub**

---

## 🗂️ Project Modules

* Complaint Registration Module
* Complaint Management Module
* Status Tracking Module
* Admin Module

---

## 📦 Entity Overview

**Complaint Entity Fields:**

* complaintId
* userName
* complaintType
* description
* status
* createdAt
* updatedAt

---

## 🔗 REST API Endpoints

### Complaint APIs

| HTTP Method | Endpoint                    | Description              |
| ----------- | --------------------------- | ------------------------ |
| POST        | /api/complaints             | Register a new complaint |
| GET         | /api/complaints             | Get all complaints       |
| GET         | /api/complaints/{id}        | Get complaint by ID      |
| PUT         | /api/complaints/{id}        | Update complaint details |
| DELETE      | /api/complaints/{id}        | Delete complaint         |
| PATCH       | /api/complaints/{id}/status | Update complaint status  |

---

## 📥 Sample Request (POST)

```json
{
  "userName": "Mr. Chris",
  "complaintType": "Water Leakage",
  "description": "Water leaking from ceiling"
}
```

---

## 📤 Sample Response (GET)

```json
{
  "complaintId": 1,
  "userName": "Mr. Chris",
  "complaintType": "Water Leakage",
  "description": "Water leaking from ceiling",
  "status": "OPEN",
  "createdAt": "2026-02-06T10:30:25",
  "updatedAt": "2026-02-06T10:30:25"
}
```

---

## 🖥️ Output (Postman)

* Complaint successfully created with **201 Created** status
* Complaint list retrieved with **200 OK**
* Complaint updated with **200 OK**
* Complaint deleted with **204 No Content**

---

## ⚠️ Exception Handling

* Complaint Not Found Exception
* Validation Errors
* Global Exception Handling using `@ControllerAdvice`

---

## 🚀 How to Run the Project

1. Clone the repository

   ```bash
   git clone https://github.com/your-username/ComplaintTrackingSystemProject.git
   ```
2. Import the project into Eclipse
3. Configure MySQL database in `application.properties`
4. Run the Spring Boot application
5. Test APIs using Postman

---

## 📄 Resume Description

> Developed a Complaint Tracking System using Spring Boot and REST APIs to manage user complaints efficiently. Implemented CRUD operations, exception handling, and MySQL database integration. Tested APIs using Postman and followed layered architecture with clean code practices.

---

## 📌 Future Enhancements

* Role-based authentication (JWT)
* Frontend using Angular or React
* Email/SMS notifications
* Dashboard & analytics

---

## 👨‍💻 Author

**Abhishek Bedarkar**
Full Stack Java Developer

---

⭐ If you like this project, don’t forget to star the repository!
