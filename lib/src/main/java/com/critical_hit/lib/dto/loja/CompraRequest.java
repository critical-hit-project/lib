package com.critical_hit.lib.dto.loja;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Schema(description = "Solicitação de compra")
public record CompraRequest(

    @Schema(description = "ID do usuário", example = "1")
    @NotNull(message = "O usuário é obrigatório")
    Long usuarioId,

    @Schema(description = "IDs dos jogos", example = "[1, 2]")
    @NotEmpty(message = "A compra deve conter pelo menos um jogo")
    List<Long> jogoIds

) {}