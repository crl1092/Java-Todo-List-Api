package com.example.todoapi.configurations;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Todo List Api")
                        .version("1.0")
                        .description("Essa é a documentação interativa da API desenvolvida para estudos com integração com o postgreSQL e para compor meu portifólio backend juntamente com o de mobile usando flutter")
                        .contact(new Contact()
                                .name("Cristhiano Rodrigues")
                                .email("rodriguescristhiano4@gmail.com")
                                .url("https://portifolio-flutter.vercel.app")));
    }
}
