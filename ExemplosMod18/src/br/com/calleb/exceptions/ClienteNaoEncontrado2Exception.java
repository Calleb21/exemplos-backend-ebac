package br.com.calleb.exceptions;

public class ClienteNaoEncontrado2Exception extends Exception{

    private Exception ex;

    public ClienteNaoEncontrado2Exception(String msg, Throwable ex) {
        super(msg, ex);
    }
}
