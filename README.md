# Hospital-Appointment-System

# Group Member:
1.Priti Abhijit Dikole
2.Chaitanya Vinod Bhosale
3.Trupti Tukaram Misal

---

## Technologies Used
- Java 17 (Java SE)
- Spring Boot 3.2.0
- Maven (for build and dependency management)
- PostgreSQL 17 (Database)
- pgAdmin 4 (Database management tool)
- HTML/CSS/JavaScript (Frontend UI)
- Logging frameworks: Logback, Log4j

---

## Maven Dependencies
Key dependencies included in `pom.xml`:
- `spring-boot-starter-web`
- `spring-boot-starter`
- `spring-boot-autoconfigure`
- `spring-boot-starter-logging`
- `jackson-databind`
- `spring-boot-starter-tomcat`
- `spring-web`
- `spring-beans`

---

## Database Details
- **Database**: PostgreSQL
- **Database Name**: hospital_appointment
- Used pgAdmin 4 to create and manage the database.
- Stores patient appointment information.

---

## How to Run the Project
1. Ensure PostgreSQL server is running and the database `hospital_appointment` is created.
2. Clone or download the project repository.
3. Open the project in an IDE like Eclipse or IntelliJ IDEA.
4. Configure database connection in `application.yml` or `application.properties` file:
    ```yaml
    spring:
      datasource:
        url: jdbc:postgresql://localhost:5432/hospital_appointment
        username: your_db_username
        password: your_db_password
      jpa:
        hibernate:
          ddl-auto: update
        show-sql: true
    ```
5. Build the project with Maven:
    ```bash
    mvn clean install
    ```
6. Run the Spring Boot application:
    ```bash
    mvn spring-boot:run
    ```
7. Open your browser and go to:
    ```
    http://localhost:3000/index.html
    ```
8. Use the UI to enter patient name and appointment date, then click "Book Appointment" to save.

---

## Features
- Simple and user-friendly UI for booking hospital appointments.
- Backend REST API developed using Spring Boot.
- Appointment data is persisted in PostgreSQL database.
- Logs important application events using Logback and Log4j.
- Runs on embedded Tomcat server.

---

## Future Improvements
- User authentication and authorization.
- Adding appointment time slots and doctor selection.
- Email/SMS notifications for booked appointments.
- More sophisticated frontend using React or Angular.
- Features to cancel or reschedule appointments.

---

## Contact
For any questions or issues, please contact the developer at:  
Name:- Priti ABhijit Dikole
Email Id:-pritidikole9@gmail.com

---

## Screenshot of the UI

![Hospital Appointment System](./hospital-appointment-ui.png)  
*(Replace with actual image path if needed)*

---

Thank you for using the Hospital Appointment System!
