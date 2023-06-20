package br.com.calleb.template;

public abstract class Trabalhador {

    protected void executar() {
        iniciarRotina();
        levantar();
        irAoTrabalho();
        trabalhar();
        voltarParaCasa();
    }

    protected abstract void trabalhar();

    protected void voltarParaCasa() {
        System.out.println("Voltando para casa");
    }

    protected void irAoTrabalho() {
        System.out.println("Indo para o trabalho");
    }

    protected void iniciarRotina() {
        System.out.println("Iniciando Rotina");
    }

    protected void levantar() {
        System.out.println("Levantando as 8h am");
    }
}
