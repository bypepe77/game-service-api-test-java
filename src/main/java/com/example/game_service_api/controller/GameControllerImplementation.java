package com.example.game_service_api.controller;


import com.example.game_service_api.entities.Game;
import com.example.game_service_api.exceptions.GameIDNotProvidedException;
import com.example.game_service_api.exceptions.GameNameNotProvided;
import com.example.game_service_api.exceptions.GameNotFoundException;
import com.example.game_service_api.repsoitories.GameRepository;
import com.example.game_service_api.services.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/games")
public class GameControllerImplementation implements GameController{
    private final GameService gameService;

    public GameControllerImplementation(GameService gameService) {
        this.gameService = gameService;

    }

    @Override()
    public ResponseEntity<Game> save(@RequestBody Game game) {
        Game savedGame = this.gameService.save(game);
        return ResponseEntity.ok(savedGame);
    }

    @Override()
    public ResponseEntity<Game> getByID(String id) {
        Game game = this.gameService.getById(id);
        return ResponseEntity.ok(game);
    }

    @Override()
    public ResponseEntity<Game> update(@PathVariable String id, @RequestBody Game gameToUpdate) {
        if (id == null || gameToUpdate == null) {
            throw new GameIDNotProvidedException("Game ID not provided");
        }

        if (gameToUpdate.getName() == null || gameToUpdate.getName().isEmpty()) {
            throw new GameNameNotProvided("Game name not provided");
        }

        Game updatedGame = this.gameService.update(id,gameToUpdate);
        return ResponseEntity.ok(updatedGame);
    }

    @Override
    public ResponseEntity<String> delete(@PathVariable String id) {
        if (id == null || gameService.getById(id) == null){
            throw new GameIDNotProvidedException("Game ID not provided");
        }

        String Id = this.gameService.delete(id);
        if (Id == null){
            throw new GameNotFoundException("Game not found");
        }

        return ResponseEntity.ok("Deleted game successfully");
    }
}
