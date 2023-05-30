package br.com.calleb.interfaces;

public interface ICarro {

    default void parar() {
        System.out.println("O automovel está parando");
    }

    public void andar();
}
