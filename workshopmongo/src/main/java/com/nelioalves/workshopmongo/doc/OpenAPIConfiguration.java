package com.nelioalves.workshopmongo.doc;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;


@Configuration
public class OpenAPIConfiguration {

    @Bean
    public OpenAPI defineOpenApi() {
        Server server = new Server();
        server.setUrl("http://localhost:8080");
        server.setDescription("Development");

        Contact myContact = new Contact();
        myContact.setName("Miguel Piva");
        myContact.setUrl("https://github.com/MiguelPiva");

        Info information = new Info()
                .title("Workshop MongoDB")
                .description("API RESTful com Spring Boot e MongoDB.")
                .version("1.0")
                .contact(myContact);
        return new OpenAPI().info(information).servers(List.of(server));
    }
}
