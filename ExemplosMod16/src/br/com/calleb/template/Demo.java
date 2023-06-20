package br.com.calleb.template;

public class Demo {

    public static void main(String args[]) {
        Trabalhador bombeiro = new Bombeiro();
        System.out.println("Bombeiro: ");
        bombeiro.executar();

        System.out.println();

        Trabalhador policial = new Policial();
        System.out.println("Policial: ");
        policial.executar();

        System.out.println();

        Trabalhador advogado = new Advogado();
        System.out.println("Advogado: ");
        advogado.executar();
    }
}
