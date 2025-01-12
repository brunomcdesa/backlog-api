package br.com.backolog.backlogapi.modulos.game.service;

import br.com.backolog.backlogapi.modulos.game.dto.GameRequest;
import br.com.backolog.backlogapi.modulos.game.model.Game;
import br.com.backolog.backlogapi.modulos.game.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameService {

    private final GameRepository gameRepository;

    public void save(GameRequest request) {
        var game = Game.of(request);
        gameRepository.save(game);
    }

    public List<Game> findAll() {
        return gameRepository.findAll();
    }
}
