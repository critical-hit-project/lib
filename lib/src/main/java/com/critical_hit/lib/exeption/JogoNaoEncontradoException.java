// lib/src/main/java/com/critical_hit/lib/exception/JogoNaoEncontradoException.java
package com.critical_hit.lib.exeption;

public class JogoNaoEncontradoException extends RuntimeException {

    public JogoNaoEncontradoException() {
        super("Jogo não encontrado");
    }

    public JogoNaoEncontradoException(String message) {
        super(message);
    }
}