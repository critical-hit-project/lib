package com.critical_hit.lib.dto.erro;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

@Schema(description = "Formato padronizado de erro da API")
public record ErroResponse(

    @Schema(example = "404")
    int status,

    @Schema(example = "Jogo não encontrado")
    String mensagem,

    @Schema(example = "/jogos/10")
    String path,

    @Schema(example = "2026-10-09T20:00:00")
    LocalDateTime timestamp

) {}