package com.jmachuca.curso.error.springboot_error.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmachuca.curso.error.springboot_error.models.domain.User;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private List<User> users;

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public Optional<User> findById(Long id) {
        return users.stream().filter( usr -> usr.getId().equals(id) ).findFirst();
    }

}
