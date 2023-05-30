package br.com.calleb.interfaces;

public class Caminhao implements ICarro{
    @Override
    public void andar() {
        System.out.println("Caminhão está andando de vagar!");
    }

    @Override
    public void parar() {
        System.out.println("O caminhão está parando");
    }
}
