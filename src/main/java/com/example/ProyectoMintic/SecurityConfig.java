package com.example.ProyectoMintic;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@EnableWebSecurity

public class SecurityConfig {
    public SecurityConfig() {
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return (SecurityFilterChain)((HttpSecurity)http.oauth2Login().and()).build();
    }


}