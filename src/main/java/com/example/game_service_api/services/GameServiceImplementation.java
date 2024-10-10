package com.example.game_service_api.services;


import com.example.game_service_api.entities.Game;
import com.example.game_service_api.exceptions.GameIDNotProvidedException;
import com.example.game_service_api.exceptions.GameNameNotProvided;
import com.example.game_service_api.exceptions.GameNotFoundException;
import com.example.game_service_api.repsoitories.GameRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class GameServiceImplementation implements GameService {
    private final GameRepository gameRepository;

    public GameServiceImplementation(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public Game save(Game game) {
        return this.gameRepository.save(game);
    }

    public Game getById(String id) {
        return this.gameRepository
                .findById(Long.valueOf(id))
                .orElseThrow( () -> new GameNotFoundException("Game with ID " + id + " not found."));
    }


    public Game update(String id , Game gameToUpdate) {
        Game game = this.getById(id);
        if (game == null){
            throw new GameNotFoundException("Game not found");
        }

        String newName = gameToUpdate.getName();
        game.setName(newName);

        return this.save(game);
    }

    public String delete(String id) {
        Game game = this.getById(id);
        if (game ==  null) {
            throw new GameNotFoundException("Game with ID " + id + " not found.");
        }

        this.gameRepository.deleteById(Long.valueOf(id));
        return id;
    }
}
