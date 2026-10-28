package com.critical_hit.lib.dto.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class AtualizarUsuarioRequest {
    @Size(max = 120) String nome;
    @Email @Size(max = 120) String email;
    @Size(max = 120) String senha;
    @Size(max = 40) String genero;
    @Past LocalDate dataNascimento;
}
