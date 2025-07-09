package com.jmachuca.curso.error.springboot_error.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jmachuca.curso.error.springboot_error.models.domain.User;

@Service
public class UserServiceImpl implements UserService{

    private List<User> users;

    public UserServiceImpl() {
        this.users = new ArrayList<>();

        users.add(new User(1L, "Pepe", "Gonzalez"));
        users.add(new User(2L, "Juan", "Perez"));
        users.add(new User(3L, "Maria", "Lopez"));
        users.add(new User(4L, "Ana", "Garcia"));
        users.add(new User(5L, "Luis", "Rodriguez"));
    } 

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public Optional<User> findById(Long id) {
        User user = null;

        for (User u : users) {
            if (u.getId().equals(id)) {
                user = u;
                break;
            }
        }

        return Optional.ofNullable(user);
    }

}
