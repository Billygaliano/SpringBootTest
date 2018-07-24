# SpringBootTest
This is a practical test for WBS. Creating a Spring Boot application with Maven.

## API REST Description


## Development Environment
For the development of this project, I have used the following environment:
- Java 1.8.0_60
- Maven 3.5.4
- Tomcat v9
- IDE: Eclipse

## Deploy
Before deploying our project, it is necessary to install the tools of our environment described in the previous section.

Once the environment is ready, you just have to clone the git repository in your workspace. After this, you will only have to build the project to download all maven dependencies including **spring-boot-starter-web** and run the project on the server.

## Features
This API REST has a responsive page (BMW theme) where you can try two of its 3 features:
- Get all the BMWs from database (*/api/cars*)
- Get by ID a specific car (*/api/car?id=1*)

**Before that, some vehicles would have to be entered into the database. For this, we can use the functionality of adding vehicles from our REST API**. We can use a REST client like Postman to add vehicles with post method with path */api/add-car*.

You can use the field *list-creation-cars.json* of thiss reposcitory as a guide to build the Request Body of this functionality


