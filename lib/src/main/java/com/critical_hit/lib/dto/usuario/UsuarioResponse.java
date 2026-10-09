package com.critical_hit.lib.dto.usuario;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.time.LocalDate;

@Schema(description = "Dados públicos do usuário")
public record UsuarioResponse(

    @Schema(example = "1")
    Long id,

    @Schema(example = "Ana Souza")
    String nome,

    @Schema(example = "ana@email.com")
    String email,

    @Schema(example = "Feminino")
    String genero,

    @Schema(example = "2001-05-20")
    LocalDate dataNascimento,

    @Schema(description = "Saldo da carteira", example = "100.00")
    BigDecimal carteira

) {}