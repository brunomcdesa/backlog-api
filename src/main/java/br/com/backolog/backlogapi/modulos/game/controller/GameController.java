package br.com.backolog.backlogapi.modulos.game.controller;

import br.com.backolog.backlogapi.modulos.game.dto.GameRequest;
import br.com.backolog.backlogapi.modulos.game.model.Game;
import br.com.backolog.backlogapi.modulos.game.service.GameService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/games")
public class GameController {

    private final GameService gameService;

    @PostMapping
    @ResponseStatus(CREATED)
    public void save(@RequestBody @Valid GameRequest request) {
        gameService.save(request);
    }

    @GetMapping
    public List<Game> findAll() {
        return gameService.findAll();
    }
}

