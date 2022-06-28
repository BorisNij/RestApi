package net.bnijik.srest.RestApi;

import org.junit.jupiter.api.Test;
import org.testcontainers.containers.JdbcDatabaseContainer;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;


@Testcontainers
class RestApiApplicationTests {

    @SuppressWarnings("resource")
    @Container
    private static final JdbcDatabaseContainer<?> postgresDb = new PostgreSQLContainer<>("postgres:latest")
            .withInitScript("init.sql");

    /*@DynamicPropertySource
    public static void overrideProps(DynamicPropertyRegistry registry) {
        registry.add("spring.datasource.url", postgresDb::getJdbcUrl);
        registry.add("spring.datasource.username", postgresDb::getUsername);
        registry.add("spring.datasource.password", postgresDb::getPassword);
    }*/

    @Test
    void contextLoads() {
    }

}
