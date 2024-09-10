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


*************************************************************************
                       Run the Application
*************************************************************************
Prerequisites:
       1.Java 8 or higher
       2.JUnit (for unit testing)
       3.VS Code (or any other preferred IDE)

****************************************************************************
                      Compile the Application:
****************************************************************************
In the terminal, navigate to the source folder and run the following command:

        javac -d bin src/*.java

Run the Application:

To run the application, use the following command:

        java -cp bin LibraryManagementSystem

*************************************************************************
                     Running Unit Tests
*************************************************************************
Install JUnit:

  -Make sure JUnit 4 or 5 is set up in your development environment.
*************************************************************************  
                     Compile the Test Classes:
*************************************************************************

Use this command to compile the test classes:
javac -cp .:path_to_junit.jar -d bin src/*.java test/*.java
*************************************************************************
                         Run the Tests:
*************************************************************************
Run the tests using:
java -cp .:path_to_junit.jar org.junit.runner.JUnitCore test.LibraryTests

*************************************************************************
                           CONCLUSION
*************************************************************************
In conclusion, this Java Library Management System project effectively demonstrates the 
key principles of Object-Oriented Programming (OOP). This system manages books in a 
library, providing functionality for adding, checking out, and returning books, while also 
allowing for advanced operations like sorting and searching. Utilize abstract classes and 
interfaces to model distinct types of library users and implement custom exceptions to 
manage specific error scenarios.
