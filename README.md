# Student Management App

A **Java-based console application** for managing student records. This project allows users to add, view, and delete student records stored in a MySQL database. It leverages JDBC to interact with the database and provides a simple interface through console input.

## Features

- **Add Student**: Add new student records by providing their name, phone number, and city.
- **View Students**: Display all student records stored in the MySQL database.
- **Delete Student**: Remove specific student records from the system by their ID.
- **Database Integration**: Connects to a MySQL database using JDBC for persistent data storage.

## Technologies Used

- **Java**: Core programming language for the application logic.
- **JDBC**: Java Database Connectivity for MySQL integration.
- **MySQL**: Database management system used to store student data.
- **BufferedReader**: For capturing user input from the console.

## Prerequisites

- **JDK 11+**: Ensure Java is installed and configured on your machine.
- **MySQL**: Install MySQL and create a database for the project.
- **MySQL Connector JAR**: Download and include the `mysql-connector-java-5.1.23-bin.jar` in your project's classpath.

## Setup Instructions

1. **Clone the repository**:
    ```bash
    git clone https://github.com/Swati-Adhe/Student_Mangement_App.git
    ```

2. **Add MySQL Connector to Project**:
    - Download the [MySQL Connector](https://dev.mysql.com/downloads/connector/j/).
    - Include the `mysql-connector-java-5.1.23-bin.jar` in your project's build path.

3. **Configure MySQL connection**:
    - Update the MySQL credentials (username, password, and database URL) in the `CP.java` file:
      ```java
      String user= "your-username";
      String password= "your-password";
      String url= "jdbc:mysql://localhost:3306/your-database";
      ```

4. **Run the application**:
    - Use an IDE like Eclipse or IntelliJ IDEA, or compile and run from the command line:
      ```bash
      javac -cp .:mysql-connector-java-5.1.23-bin.jar com/student/manage/StudentManagement.java
      java -cp .:mysql-connector-java-5.1.23-bin.jar com/student/manage/StudentManagement
      ```

## Usage

1. Run the application in your IDE or terminal.
2. Use the console menu to:
    - Add a new student by providing their details.
    - View all students stored in the database.
    - Delete students based on their ID.
3. The application will interact with the MySQL database and display the results in the console.



## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
