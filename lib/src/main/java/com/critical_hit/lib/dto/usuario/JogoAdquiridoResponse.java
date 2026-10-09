package com.critical_hit.lib.dto.usuario;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

@Schema(description = "Jogo adquirido pelo usuário")
public record JogoAdquiridoResponse(

    @Schema(example = "1")
    Long jogoId,

    @Schema(example = "2026-10-09T20:00:00")
    LocalDateTime dataAquisicao

) {}