package com.example.game_service_api.services;

import com.example.game_service_api.entities.Game;

public interface GameService {
    Game save(Game game);
    Game getById(String id);
    String delete(String id);
    Game update(String id , Game gameToUpdate);
}
