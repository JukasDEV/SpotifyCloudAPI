package com.ProjetoCloud.SpotifyAPI.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Spotify API")
                        .version("v1")
                        .description("Esta é uma API de exemplo para o gerenciamento de usuários do Spotify.")
                        .termsOfService("http://spotify.com/terms")
                        .contact(new Contact()
                                .name("Suporte Spotify")
                                .url("http://spotify.com/support")
                                .email("support@spotify.com"))
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }
}
