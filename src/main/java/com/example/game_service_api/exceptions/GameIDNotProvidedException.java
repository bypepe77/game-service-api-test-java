package com.example.game_service_api.exceptions;

import org.springframework.http.HttpStatus;

public class GameIDNotProvidedException extends ApiException {

    public GameIDNotProvidedException(String message) {
        super(message, HttpStatus.NOT_ACCEPTABLE);
    }
}
