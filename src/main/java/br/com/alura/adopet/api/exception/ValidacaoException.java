package br.com.alura.adopet.api.exception;

public class ValidacaoException extends RuntimeException {
    // construtor da exception
    public ValidacaoException(String message) {
        super(message);
    }
}
