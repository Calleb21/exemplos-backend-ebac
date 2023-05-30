package br.com.calleb.interfaces;

public interface ICaneta {

    public void escrever(String texto);
    public String  getCor();

    default void escreverComumATodas() {
        System.out.println("Escreva igual a todas!");
    }
}
