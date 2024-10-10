# Game Service API

This project is designed for testing and practicing building an API using **Java** and the **Spring Boot** framework. The API allows you to perform basic operations such as creating, updating, retrieving, and deleting games.

## Features

- **Create Game**: Add new games to the database.
- **Update Game**: Modify existing games by ID.
- **Retrieve Game**: Fetch a game by its ID.
- **Delete Game**: Remove a game from the database by ID.

## Technologies Used

- **Java**: Main programming language used in this project.
- **Spring Boot**: Java-based framework for building web applications and REST APIs.
- **Maven**: Build tool for managing dependencies and building the project.
- **PostgreSQL** (optional): The database to store game information.
- **Docker**: For easily running a PostgreSQL database container.

## How to Run

### Running the API

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/game-service-api.git
    ```

2. Navigate to the project directory:
    ```bash
    cd game-service-api
    ```

3. Build the project using Maven:
    ```bash
    mvn clean install
    ```

4. Run the project:
    ```bash
    mvn spring-boot:run
    ```

5. The API will be available at `http://localhost:8080/games`.

### Running PostgreSQL with Docker

If you want to run PostgreSQL locally using Docker, you can do it with the following steps:

1. Make sure you have Docker installed.

2. Run the following command to start a PostgreSQL container:
    ```bash
    docker-compose up
    ```

3. The PostgreSQL database will be available at `localhost:5432`, and you can configure your application to connect to it by setting the following in your `application.properties` or `application.yml`:
    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/db
    spring.datasource.username=postgres
    spring.datasource.password=1234
    ```

## Example API Endpoints

- **POST /games**: Add a new game.
- **PUT /games/{id}**: Update an existing game by ID.
- **GET /games/{id}**: Retrieve a game by its ID.
- **DELETE /games/{id}**: Delete a game by its ID.

## Requirements

- **Java 8** or higher
- **Maven**
- **Docker** (for running PostgreSQL container)
- **PostgreSQL** (if using a database manually instead of Docker)
- **Postman** or **cURL** to test the API

## License

This project is for educational purposes and does not require a license.
