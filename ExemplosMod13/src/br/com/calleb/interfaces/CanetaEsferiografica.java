package br.com.calleb.interfaces;

public class CanetaEsferiografica implements ICaneta {

    @Override
    public void escrever(String texto) {
        System.out.println("Escrevendo o valor " + texto + ", na classe " + getClass().getSimpleName() + "!");
    }

    @Override
    public String getCor() {
        return "Preta";
    }
}
