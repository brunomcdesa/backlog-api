package br.com.backolog.backlogapi.modulos.game.repository;

import br.com.backolog.backlogapi.modulos.game.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {
}
