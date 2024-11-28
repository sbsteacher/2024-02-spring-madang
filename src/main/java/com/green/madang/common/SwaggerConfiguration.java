package com.green.madang.common;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
    info = @Info(
        title = "마당서점",
        version = "v0.0.1",
        description = "Madang API"
    )
)
@Configuration //@Bean 빈등록이 SingleTone이 되도록 보장
public class SwaggerConfiguration {
    @Bean
    public GroupedOpenApi groupManager() {
        return GroupedOpenApi.builder()
                .group("manager")
                .pathsToMatch("/manager/**", "")
                .pathsToExclude("/manager/book")
                .build();
    }

    @Bean
    public GroupedOpenApi groupClient() {
        return GroupedOpenApi.builder()
                .group("client")
                .packagesToScan("com.green.madang.client", "")
                .build();
    }

    @Bean
    public GroupedOpenApi groupBook() {
        return GroupedOpenApi.builder()
                .group("book")
                .pathsToMatch("/manager/book")
                .build();
    }
}
