package com.jmachuca.curso.error.springboot_error.exceptions;


public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException() {
        super("Usuario no encontrado!");
    }

}
