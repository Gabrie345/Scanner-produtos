package com.tqc.scanner.exception;

public class ProdutoNotFoundException extends RuntimeException {

    public ProdutoNotFoundException(String message) {

        super(message);
    }
}
