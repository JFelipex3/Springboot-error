package com.jmachuca.curso.error.springboot_error.services;

import java.util.List;

import com.jmachuca.curso.error.springboot_error.models.domain.User;

public interface UserService {

    List<User> findAll();
    User findById(Long id);
}
