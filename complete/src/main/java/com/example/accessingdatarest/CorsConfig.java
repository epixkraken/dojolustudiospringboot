package com.example.accessingdatarest;



import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.CorsRegistry;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@Configuration

public class CorsConfig implements WebMvcConfigurer {



    @Override

    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/**") // Permitir todo

                .allowedOrigins("*") // En producción pon la URL de tu front

                .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH")

                .allowedHeaders("*");

    }

}