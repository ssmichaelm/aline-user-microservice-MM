package com.aline.usermicroservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.aline")
@EntityScan("com.aline.core.model")
@EnableJpaRepositories("com.aline.core.repository")
@SpringBootApplication
@OpenAPIDefinition(info =
    @Info(
            title = "User Microservice API",
            description = "This microservice handles the registration, updating, deletion, and retrieving of users.",
            version = "1.0"
    )
)
public class UserMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserMicroserviceApplication.class, args);
    }

}
