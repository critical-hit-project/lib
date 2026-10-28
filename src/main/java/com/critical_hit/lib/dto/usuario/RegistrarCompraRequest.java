package com.critical_hit.lib.dto.usuario;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.util.List;

@Schema(description = "Dados da compra enviados pela loja ao usuário")
public record RegistrarCompraRequest(

    @Schema(example = "[1, 2]")
    @NotEmpty(message = "A lista de jogos não pode estar vazia")
    List<Long> jogoIds,

    @Schema(example = "99.98")
    @NotNull(message = "O valor total é obrigatório")
    @Positive(message = "O valor total deve ser positivo")
    BigDecimal valorTotal

) {}