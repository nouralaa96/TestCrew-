# STCTV Test Automation Framework

## Overview
This repository contains the Test Automation Framework for STCTV, which is designed to automate and test the functionality of the STCTV website. The framework is built using Behavior-Driven Development (BDD) principles, utilizing Cucumber for test scenarios, Selenium for browser automation, and TestNG for test execution. It follows the Page Object Model (POM) and Singleton design patterns to provide efficient and maintainable test code.

## Framework Components

### Core Technologies
- Java
- Selenium WebDriver
- TestNG
- Cucumber

### Design Patterns
- Page Object Model (POM)
- Singleton Design Pattern

### Utilities
- JSON Reader: To read test data from JSON files
- Properties Reader: For configuration management
- Wait Utilities: Custom wait methods for synchronized test execution

### Continuous Integration
- Jenkins integration for automated test execution

## Project Structure

The project structure follows the common layout for a TestNG and Cucumber-based framework:


## Setup and Configuration

1. **Java and IDE**: Ensure you have Java Development Kit (JDK) and an Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse installed.

2. **Maven**: This project uses Maven for dependency management. You can import the project as a Maven project in your IDE.

3. **WebDriver**: You need to configure Selenium WebDriver for browser automation. WebDriver setup can be done in the `TestRunner` class or as per your project's requirements.

4. **Test Data**: Create test data in JSON format and place it in the `resources/data` directory. You can use the provided `JsonReader` utility to read this data.

5. **Configuration**: Update the `properties` file in the `resources` directory for configuration management.

6. **Jenkins**: Set up Jenkins jobs for automated test execution as needed.

## Execution

To execute the tests, you can run the `TestRunner` class with TestNG. You can also configure Jenkins for continuous integration.

## Reporting

Cucumber provides built-in reporting features. You can view the test reports in HTML format after test execution.

## Contributing

Feel free to contribute to this project by opening issues, proposing improvements, or submitting pull requests.

Happy testing!
