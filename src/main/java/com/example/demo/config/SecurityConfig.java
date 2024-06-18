package com.example.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
             .csrf().disable()
            .authorizeRequests()
                .requestMatchers("/api/v1/users/register").permitAll() // Allow access to registration endpoint
                .requestMatchers("/api/v1/users/fetch/{email}").permitAll() // Allow access to login endpoint
                .requestMatchers("/api/v1/users/**").authenticated(); // Restrict access to all other user endpoints
               // Allow access to all other endpoints
                
        
        return http.build();
    }
}
