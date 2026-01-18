# Complex Computing Problem (CCP) – Software Construction

## Project Overview

This project is developed as part of the *Complex Computing Problem (CCP)* for the *Software Construction* course.  
It implements a medium-sized UML class diagram using *core Java* while strictly following object-oriented design principles, clean code practices, defensive programming techniques, and structured unit testing.
The system demonstrates correct implementation of domain classes, object relationships, and complete use case execution through a main program.

  

## Technologies Used

- Programming Language: Java  
- IDE: Visual Studio Code  
- Testing Framework: JUnit 5  
- Project Type: Plain Java Project (No Maven / No Gradle)
  

## Project Structure

CCP-CHARAN-CS

│

├── src

│ ├── main

│ │ ├── (Domain classes)

│ │ └── Main.java

│ │

│ └── test

│ └── (Unit test classes)

│

└── README.md

  
## UML Design Implementation

- All classes, attributes, and methods are implemented exactly according to the provided UML diagram.
- Correct access modifiers are maintained.
- Object-oriented relationships such as inheritance, association, aggregation, and composition are properly applied.
- The implementation strictly adheres to the given design without introducing undocumented functionality.

## Clean Code Practices

The following clean code principles are applied:

- Meaningful and consistent naming conventions
- Small, focused methods with single responsibilities
- High cohesion and low coupling
- Clear separation of concerns
- Elimination of duplicated logic and unnecessary complexity
  

## Defensive Programming

- All constructor parameters and method inputs are validated.
- Invalid or unexpected inputs are handled gracefully.
- Illegal object states are prevented.
- Appropriate exception handling is used to ensure system stability.

## Unit Testing

- Each domain class has a corresponding unit test class.
- Tests strictly follow the \\*AAA (Arrange–Act–Assert)\\* pattern.
- Parameterized tests are used where applicable.
- Test coverage includes:
     - Normal scenarios
     - Boundary cases
     - Invalid and exceptional inputs

  

All unit tests pass successfully.
  
## How to Run the Project in VS Code

### 1. Clone the Repository

bash
git clone https://github.com/charankumar01/CCP-CHARAN-CS.git


### 2. Open in Visual Studio Code

Open VS Code
Select File → Open Folder
Open the cloned project folder
Ensure the Java Extension Pack is installed
Make sure a compatible JDK is configured

Running the Main Program

Open Main.java
Click Run above the main() method, or
Right-click → Run Java

The console output demonstrates:

Object creation
Interaction between domain objects
Execution of all core UML use cases

Running Unit Tests in VS Code

Open the Testing panel in VS Code
Run all tests or individual test classes
Ensure all tests pass successfully
JUnit 5 must be available in the project’s referenced libraries.

Git Commit Requirements

Minimum of 5 meaningful commits
Commits made on different dates

Each commit reflects logical progress such as:

Domain implementation
Feature development
Unit testing
Refactoring
Documentation updates

  

Academic Integrity
This project is original and completed individually.
No plagiarism, code sharing, or unauthorized collaboration has been involved.

  

Author
Name: Charan Kumar

Program: BS Software Engineering

Course: Software Construction
