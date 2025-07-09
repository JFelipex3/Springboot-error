package com.jmachuca.curso.error.springboot_error;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jmachuca.curso.error.springboot_error.models.domain.User;

@Configuration
public class AppConfig {

    @Bean
    List<User> users() {
        
        List<User> users = Arrays.asList(
            new User(1L, "Pepe", "Gonzalez"),
            new User(2L, "Juan", "Perez"),
            new User(3L, "Maria", "Lopez"),
            new User(4L, "Ana", "Garcia"),
            new User(5L, "Luis", "Rodriguez")
        );

        return users;

    }


}
