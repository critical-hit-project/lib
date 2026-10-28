package com.critical_hit.lib.dto.usuario;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "Credenciais para login")
public record LoginRequest(

    @Schema(example = "ana@email.com")
    @NotBlank(message = "O e-mail é obrigatório")
    @Email(message = "E-mail inválido")
    String email,

    @Schema(example = "segredo123")
    @NotBlank(message = "A senha é obrigatória")
    String senha

) {}