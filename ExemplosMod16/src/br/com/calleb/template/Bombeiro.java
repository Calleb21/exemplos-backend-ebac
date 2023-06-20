package br.com.calleb.template;

public class Bombeiro extends Trabalhador {

    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como bombeiro");
    }

//    @Override
//    protected void executar() {
//        System.out.println("Estou de Férias");
//    }
}
