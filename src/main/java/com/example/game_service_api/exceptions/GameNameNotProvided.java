package com.example.game_service_api.exceptions;

import org.springframework.http.HttpStatus;

public class GameNameNotProvided extends ApiException {

    public GameNameNotProvided(String message) {
        super(message, HttpStatus.NOT_ACCEPTABLE);
    }
}
