package br.com.calleb.reflections.anotacao.cadastro.exception;

public class DadoInvalidosException extends Exception {

    public DadoInvalidosException(String msg) {
        this(msg, null);
    }

    public DadoInvalidosException(String msg, Throwable e) {
        super(msg, e);
    }
}
