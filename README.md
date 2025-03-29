# Spring Boot Multi-Module Project

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Maven](https://img.shields.io/badge/apache_maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

A demonstration of a multi-module Spring Boot application with clear separation between core library and web application components.

## 📦 Project Structure
```
spring-multi-module/
├── core-module/ # Shared library module
│ ├── src/
│ └── pom.xml
├── web-module/ # Web application module
│ ├── src/
│ └── pom.xml
└── pom.xml # Parent POM
```
Copy

## ✨ Features

- **Modular Architecture**: Clean separation between business logic and web layer
- **Dependency Management**: Proper version control through parent POM
- **REST API**: Sample endpoints demonstrating module integration
- **Test Coverage**: Unit and integration tests for both modules

## 🚀 Getting Started

### Prerequisites
- Java 17+
- Maven 3.8+
- Spring Boot 3.3.0

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/spring-multi-module.git
   
Build the project:
   ```bash
   mvn clean install
   ```
Run the application:
   ```bash
mvn spring-boot:run -pl web-module
   ```
The application will be available at: http://localhost:8080

🧩 Modules
Core Module
Contains business logic and domain models:

Service layer implementations

Entity definitions

Repository interfaces

Web Module
Contains web-specific components:

REST controllers

Spring Boot application class

Web configuration

🔧 Technical Details
Dependency Management
The parent POM manages:

Spring Boot dependencies

Common plugin configurations

Module versions

Key Annotations
@SpringBootApplication(scanBasePackages = "...") - Ensures component scanning across modules

@RestController - Web module controllers

@Service - Core module business services

🧪 Testing
Run all tests:

   ```bash
mvn test
   ```
🤝 Contributing
Contributions are welcome! Please follow these steps:

Fork the project

Create your feature branch (git checkout -b feature/AmazingFeature)

Commit your changes (git commit -m 'Add some AmazingFeature')

Push to the branch (git push origin feature/AmazingFeature)

Open a Pull Request

📄 License
Distributed under the MIT License. See LICENSE for more information.

📧 Contact
Uedney C. de Morais - uedneymorais.dev@gmail.com

Project Link: https://github.com/UedneyMorais/spring-multi-module