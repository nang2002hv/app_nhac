package com.tinamusic.config.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openApi(){
        return new OpenAPI().info(new Info().title("Tina Music API")
                .description("API documentation for Tina Music")
                .version("1.0.0")).servers(List.of(new Server().url("https://localhost:8080").description("Tina Music API Documentation")));

    }
}
