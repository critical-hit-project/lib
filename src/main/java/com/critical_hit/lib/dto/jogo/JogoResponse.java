package com.critical_hit.lib.dto.jogo;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;

@Schema(description = "Dados de resposta de um jogo")
public record JogoResponse(

    @Schema(example = "1")
    Long id,

    @Schema(example = "Hollow Knight")
    String nome,

    @Schema(example = "Metroidvania")
    String genero,

    @Schema(example = "Explore um reino subterrâneo")
    String descricao,

    @Schema(example = "46.99")
    BigDecimal preco,

    @Schema(description = "Indica se o jogo está disponível")
    boolean disponivel

) {}