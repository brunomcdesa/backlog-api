package br.com.backolog.backlogapi.modulos.game.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record GameRequest(
        @NotBlank
        String nome,
        @NotNull
        LocalDate dataInicio,
        LocalDate dataFim
) {
}
