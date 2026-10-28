package com.critical_hit.lib.dto.usuario;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

@Schema(description = "Dados para cadastrar ou atualizar um usuário")
public record UsuarioRequest(

    @Schema(example = "Ana Souza")
    @NotBlank(message = "O nome é obrigatório")
    @Size(max = 100)
    String nome,

    @Schema(example = "ana@email.com")
    @NotBlank(message = "O e-mail é obrigatório")
    @Email(message = "E-mail inválido")
    String email,

    @Schema(example = "segredo123")
    @NotBlank(message = "A senha é obrigatória")
    @Size(min = 6, message = "A senha deve ter pelo menos 6 caracteres")
    String senha,

    @Schema(example = "Feminino")
    String genero,

    @Schema(example = "2001-05-20")
    @NotNull(message = "A data de nascimento é obrigatória")
    @Past(message = "A data de nascimento deve ser passada")
    LocalDate dataNascimento

) {}