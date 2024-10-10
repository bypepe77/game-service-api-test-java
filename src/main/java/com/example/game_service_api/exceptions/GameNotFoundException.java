package com.example.game_service_api.exceptions;

import org.springframework.http.HttpStatus;

public class GameNotFoundException extends ApiException {

    public GameNotFoundException(String message) {
        super(message, HttpStatus.NOT_FOUND);
    }
}
