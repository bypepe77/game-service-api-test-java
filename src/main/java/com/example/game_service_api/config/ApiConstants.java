package com.example.game_service_api.config;

public final class ApiConstants {

    private ApiConstants() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static final String API_BASE_PATH = "/api/v1";
    public static final String GAMES_BASE_PATH = API_BASE_PATH + "/games";

}