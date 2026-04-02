# AddressBook-App-SpringBoot

## Overview
This project is a Spring Boot based Address Book backend application.

It is developed step-by-step using Use Cases (UCs) with proper Git branching strategy.

Each UC is implemented in a separate feature branch and pushed to GitHub for version tracking and code review.

---

## Project Approach

- Each Use Case (UC) is implemented in its own branch
- After completion, changes can be merged to main
- Git history is maintained for evaluation
- REST APIs are tested using CURL commands

(As per training guidelines)  [oai_citation:0‡FS BE_SPRING PP04 AddressBook App - Section 1 & 2 CURL Calls with Controller and Services.pdf](sediment://file_00000000953c720baefb0aad12bbbba4)

---

## Use Cases Implemented

### UC1 – AddressBook Spring Boot Setup
- Created Spring Boot project
- Configured basic REST controller
- Application runs on port 8080
- Tested initial API using browser/CURL

---

### UC2 – AddressBook Controller CRUD
- Implemented REST Controller
- Supported HTTP Methods:
  - GET (all entries)
  - GET by ID
  - POST (create)
  - PUT (update)
  - DELETE (remove)
- Ensured API connectivity and data flow

---

### UC3 – AddressBook Service Layer
- Introduced Service Layer
- Moved business logic from Controller → Service
- Used Dependency Injection
- Service handles all operations

---

### UC3 (Advanced) – In-Memory Storage
- Service Layer stores data in memory (List / Map)
- Supports:
  - Add entry
  - Update entry
  - Delete entry
  - Fetch all / by ID
- Ready for future DB integration

---

## Tech Stack

- Java 17
- Spring Boot
- Spring Web
- Maven

---

## API Endpoints

### Base URL
http://localhost:8080/addressbook

### Endpoints

GET     /addressbook  
GET     /addressbook/{id}  
POST    /addressbook  
PUT     /addressbook/{id}  
DELETE  /addressbook/{id}  

---

## Sample CURL Commands

### Create
curl -X POST http://localhost:8080/addressbook \
-H "Content-Type: application/json" \
-d '{"name":"Karthik","city":"Chennai"}'

### Get All
curl http://localhost:8080/addressbook

### Get By ID
curl http://localhost:8080/addressbook/1

### Update
curl -X PUT http://localhost:8080/addressbook/1 \
-H "Content-Type: application/json" \
-d '{"name":"Updated","city":"Chennai"}'

### Delete
curl -X DELETE http://localhost:8080/addressbook/1

---

## Branch Structure

- main → only README
- dev → basic setup (Main.java only)
- feature/UC1-AddressBookSetup
- feature/UC2-AddressBookControllerCRUD
- feature/UC3-AddressBookServiceLayer

---

## Notes

- Controller handles HTTP requests
- Service Layer handles business logic
- Data stored in memory
- Future scope → Database integration (MySQL)
