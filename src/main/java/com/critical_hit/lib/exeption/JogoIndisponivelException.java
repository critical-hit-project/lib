// lib/src/main/java/com/critical_hit/lib/exception/JogoIndisponivelException.java
package com.critical_hit.lib.exeption;

public class JogoIndisponivelException extends RuntimeException {

    public JogoIndisponivelException() {
        super("Jogo indisponível para esta operação");
    }

    public JogoIndisponivelException(String message) {
        super(message);
    }
}