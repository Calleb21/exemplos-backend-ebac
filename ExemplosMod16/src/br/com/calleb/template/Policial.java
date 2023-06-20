package br.com.calleb.template;

public class Policial extends Trabalhador {

    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como policial");
    }

    @Override
    protected void levantar() {
        System.out.println("Levantando as 5h am");
    }

    @Override
    protected void executar() {
        System.out.println("Estou de Férias");
    }
}
