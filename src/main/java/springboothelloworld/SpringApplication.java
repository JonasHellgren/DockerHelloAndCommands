package springboothelloworld;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * http://localhost:8085/rest/docker/hello
 */

@SpringBootApplication
public class SpringApplication {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(SpringApplication.class, args);
    }
}