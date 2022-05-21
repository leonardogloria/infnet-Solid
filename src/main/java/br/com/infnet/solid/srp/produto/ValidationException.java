package br.com.infnet.solid.srp.produto;

public class ValidationException extends RuntimeException{
    public ValidationException(String message) {
        super(message);
    }
}
