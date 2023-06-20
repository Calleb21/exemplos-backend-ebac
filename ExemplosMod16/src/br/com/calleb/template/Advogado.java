package br.com.calleb.template;

public class Advogado extends Trabalhador {
    @Override
    protected void trabalhar() {

    }

//    @Override
//    public void executar() {
//        System.out.println("Estou de férias");
//    }

    @Override
    protected void voltarParaCasa() {
        System.out.println("Voltando de helicoptero para a casa");
    }

    @Override
    protected void irAoTrabalho() {
        System.out.println("Indo ao trabalho de carro");
    }

    @Override
    protected void iniciarRotina() {
        System.out.println("Tomando capuccino para iniciar a rotina");
    }

    @Override
    protected void levantar() {
        System.out.println("Levantando as 8h am para trabalhar");
    }
}
