package com.example.game_service_api.controller;


import com.example.game_service_api.config.ApiConstants;
import com.example.game_service_api.entities.Game;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(ApiConstants.GAMES_BASE_PATH)
public interface GameController {
    @PostMapping
    ResponseEntity<Game> save(@RequestBody Game game);
    @GetMapping("/{id}")
    ResponseEntity<Game> getByID(@PathVariable String id);

    @PutMapping("/{id}")
    ResponseEntity<Game> update(@PathVariable String id, @RequestBody Game gameToUpdate);

    @DeleteMapping("/{id}")
    ResponseEntity<String> delete(@PathVariable String id);
}
