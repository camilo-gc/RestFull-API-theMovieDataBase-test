package com.talataa.apirestfull.configurations;

import com.fasterxml.classmate.ResolvedType;
import com.talataa.apirestfull.models.ApiResponse;
import com.talataa.apirestfull.models.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.talataa.apirestfull.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("RestFull-API-theMovieDataBase-test")
                .description("Aplicacion practica que consume la API del proyecto The Movie DataBase para obtener, " +
                        "procesar y exponer la informacion mediante los endpoints descritos")
                .termsOfServiceUrl("https://www.themoviedb.org/documentation/api/terms-of-use")
                .version("1.0.0")
                .contact(new Contact(
                        "Camilo Garcia",
                        "https://www.linkedin.com/in/jcamilo-gc/",
                        "camilogarcia.dev@gmail.com")
                )
                .licenseUrl("https://www.themoviedb.org/documentation/api")
                .license("Find out more about API - The Movie DataBase")
                .build();
    }
}

