package com.example.atividade.exceptions;

public class CreatePersonException extends RuntimeException{
    
    private static final long serialVersionUID = 1L;
    
    public CreatePersonException(String ex) {
        super(ex);
    }
}
