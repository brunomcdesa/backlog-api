package br.com.backolog.backlogapi.modulos.game.model;

import br.com.backolog.backlogapi.modulos.game.dto.GameRequest;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "GAME")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column
    private String nome;

    @Column
    private LocalDate dataInicio;

    @Column
    private LocalDate dataFim;

    public static Game of(GameRequest request) {
        return Game.builder()
                .nome(request.nome())
                .dataInicio(request.dataInicio())
                .dataFim(request.dataFim())
                .build();
    }
}
