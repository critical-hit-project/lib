package com.critical_hit.lib.dto.usuario;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

@Schema(description = "Dados para depositar na carteira")
public record DepositoRequest(

    @Schema(description = "Valor do depósito", example = "100.00")
    @NotNull(message = "O valor é obrigatório")
    @Positive(message = "O valor deve ser positivo")
    BigDecimal valor

) {}
