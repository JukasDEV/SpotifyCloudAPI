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
                        .title("SpotifyRESTAPI")
                        .version("v1")
                        .description("RESTAPI by João Curvello")
                        .contact(new Contact()
                                .name("Github")
                                .url("https://github.com/JukasDEV/SpotifyCloudAPI")
                                )
                        .license(new License().name("Linkedin").url("https://www.linkedin.com/in/jo%C3%A3o-lucas-curvello-403340269/")));
    }
}
