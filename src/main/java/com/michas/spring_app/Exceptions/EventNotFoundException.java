package com.michas.spring_app.Exceptions;

public class EventNotFoundException extends RuntimeException {

    public EventNotFoundException(){
    super("Evento não encontrado");
    }

    public EventNotFoundException(String mensagem){
        super(mensagem);
    }
}
