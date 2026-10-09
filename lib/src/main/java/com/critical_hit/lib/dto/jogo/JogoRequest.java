package com.critical_hit.lib.dto.jogo;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;

@Schema(description = "Dados para cadastrar ou atualizar um jogo")
public record JogoRequest(

    @Schema(description = "Nome do jogo", example = "Hollow Knight")
    @NotBlank(message = "O nome é obrigatório")
    @Size(max = 100)
    String nome,

    @Schema(description = "Gênero do jogo", example = "Metroidvania")
    @NotBlank(message = "O gênero é obrigatório")
    String genero,

    @Schema(description = "Descrição do jogo",
            example = "Explore um reino subterrâneo")
    @Size(max = 500)
    String descricao,

    @Schema(description = "Preço do jogo", example = "46.99")
    @NotNull(message = "O preço é obrigatório")
    @Positive(message = "O preço deve ser positivo")
    @Digits(integer = 8, fraction = 2)
    BigDecimal preco

) {}