// lib/src/main/java/com/critical_hit/lib/exception/advice/GlobalControllerAdvice.java
package com.critical_hit.lib.exeption.advice;

import com.critical_hit.lib.dto.erro.ErroResponse;
import com.critical_hit.lib.exeption.JogoIndisponivelException;
import com.critical_hit.lib.exeption.JogoNaoEncontradoException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalControllerAdvice {

    @ExceptionHandler(JogoNaoEncontradoException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErroResponse handleJogoNaoEncontrado(JogoNaoEncontradoException ex, HttpServletRequest request) {
        return new ErroResponse(
            HttpStatus.NOT_FOUND.value(),
            ex.getMessage(),
            request.getRequestURI(),
            LocalDateTime.now()
        );
    }

    @ExceptionHandler(JogoIndisponivelException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public ErroResponse handleJogoIndisponivel(JogoIndisponivelException ex, HttpServletRequest request) {
        return new ErroResponse(
            HttpStatus.UNPROCESSABLE_ENTITY.value(),
            ex.getMessage(),
            request.getRequestURI(),
            LocalDateTime.now()
        );
    }
}