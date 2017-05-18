# spring-boot-flyway-docker-sample

Minimal Spring Boot Sample application with integration tests leveraging flyway DB migrations on a PostgreSQL running inside a Docker container.

Requirements:
  * Java 8
  * Maven
  * Docker

Execute integration tests with, which will start a PostgreSQL database inside a docker container,
making it available on a random high network port:

    mvn clean verify



## Resources

  * [Integration Testing with Docker and Maven](http://info.michael-simons.eu/2016/08/25/integration-testing-with-docker-and-maven/)
  * [Execute Flyway database migrations on startup](https://docs.spring.io/spring-boot/docs/current/reference/html/howto-database-initialization.html#howto-execute-flyway-database-migrations-on-startup)
  * [Alternative: Using testcontainers and JUnit's ClassRule concept](https://github.com/testcontainers/testcontainers-java-examples/blob/master/spring-boot/src/test/java/com/example/AbstractIntegrationTest.java)
