package com.example.restservicecors;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class RestServiceCorsApplication {
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/demo").allowedOrigins("http://localhost:8081");
                registry.addMapping("/demo/all").allowedOrigins("http://localhost:8081");
            }
        };
    }
}
