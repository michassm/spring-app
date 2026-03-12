package com.michas.spring_app.Exceptions;

public class EventFullException extends RuntimeException{
    public EventFullException() {
        super("Evento esta lotado");
    }

    public EventFullException(String mensagem){
        super(mensagem);
    }
}
