************************************************************************* 
                            OVERVIEW
*************************************************************************
I have created this Library Management System using Java and it follows OOPs principles.
The system allows us to manage a collection of books, enabling actions like adding, 
searching, sorting, checking out, and returning books. It also has models of several types
of users, such as students and faculty, each with specific behaviors. Different classes 
manage specific tasks, such as the Book class for book-related data and the LibraryUser 
class for user-related behavior. Methods like borrowBook() are implemented differently 
for Student and Faculty but are called in the same way. By using interfaces like Searchable, 
new types of searches can be added easily in the future

![LibraryManagementSystem](https://github.com/user-attachments/assets/703bdbeb-6505-4f73-9d2f-cb8984276e76)

# Library Management System

This Java-based **Library Management System** demonstrates core Object-Oriented Programming (OOP) principles, such as inheritance, polymorphism, abstraction, and exception handling. It allows users (students and faculty) to borrow and return books, search for books, and manage a library collection. This project uses **JUnit** for unit testing to ensure that key functionalities work correctly.

## Table of Contents
- [Features](#features)
- [OOP Concepts](#oop-concepts)
- [Project Structure](#project-structure)
- [How to Compile and Run](#how-to-compile-and-run)
- [Running Tests](#running-tests)
- [Requirements](#requirements)
- [Exception Handling](#exception-handling)
- [Contributing](#contributing)
- [License](#license)

## Features

- **Book management:** Add, sort, and display books in the library.
- **Search functionality:** Search for books by keywords.
- **Borrow/Return books:** Students and faculty can borrow and return books using their unique ID.
- **Exception handling:** Handles invalid operations like borrowing non-existent books.
- **Unit tests:** Tests core library functionalities using JUnit.

## OOP Concepts

This project demonstrates several OOP concepts:

- **Inheritance:** The `Student` and `Faculty` classes inherit from an abstract `LibraryUser` class.
- **Polymorphism:** The `borrowBook()` method is overridden in both `Student` and `Faculty` classes to implement user-specific borrowing behavior.
- **Abstraction:** The `LibraryUser` class and the `Searchable` interface are abstract to generalize behavior.
- **Encapsulation:** Private fields with public getter and setter methods protect the state of objects.
- **Exception handling:** Custom exceptions like `BookNotFoundException` and `InvalidBookException` are used to handle error cases.

## Project Structure

Library Management System/
├── Book.java
├── BookNotFoundException.java
├── Faculty.java
├── InvalidBookException.java
├── Library.java
├── LibraryManagementSystem.java
├── LibraryTest.java
├── LibraryUser.java
├── ReadMe.md
├── Searchable.java
├── Student.java
└── lib/
    ├── junit-4.13.2.jar
    └── hamcrest-core-1.3.jar


## How to Compile and Run

### Step 1: Download Dependencies
Ensure you have **JUnit** and **Hamcrest** JARs in the `lib` folder.

### Step 2: Compile the Project

In your terminal or command prompt, navigate to the project folder and run the following command to compile all `.java` files:

javac -cp "lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" *.java
### Step 3: Run the Program
Run the main class LibraryManagementSystem:

java LibraryManagementSystem

## Running Tests
To run the unit tests, compile the files as shown above and execute the following command:

java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore LibraryTest
This will execute the tests defined in LibraryTest.java, ensuring the core functionality of the system.

## Requirements
Java: JDK 8 or higher
JUnit: Version 4.13.2
Hamcrest: Version 1.3
Ensure that these dependencies are correctly added to your classpath.

Exception Handling
This project uses custom exceptions to handle various error scenarios:

BookNotFoundException: Thrown when a user tries to borrow or return a book that does not exist in the library.
InvalidBookException: Thrown when invalid book data is encountered.
These exceptions ensure the program responds gracefully to unexpected situations.

Contributing
Feel free to submit pull requests to improve the project. Contributions may include:

Additional features or improvements.
Bug fixes or performance optimizations.
Improvements in code structure or readability.

License
This project is licensed under the MIT License. See the LICENSE file for details.


                           CONCLUSION
*************************************************************************
In conclusion, this Java Library Management System project effectively demonstrates the 
key principles of Object-Oriented Programming (OOP). This system manages books in a 
library, providing functionality for adding, checking out, and returning books, while also 
allowing for advanced operations like sorting and searching. Utilize abstract classes and 
interfaces to model distinct types of library users and implement custom exceptions to 
manage specific error scenarios.
