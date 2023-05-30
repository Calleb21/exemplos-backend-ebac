package br.com.calleb.interfaces;

public class Lapis implements ICaneta {
    @Override
    public void escrever(String texto) {
        System.out.println("Escrevendo o valor " + texto + ", na classe " + getClass().getSimpleName() + "!");
    }

    @Override
    public String getCor() {
        return "Preto claro";
    }

    public static class ClasseTeste {

        public static void main(String[] args) {
            ICaneta caneta = new CanetaEsferiografica();
            System.out.println("\n****** Caneta ******");
            caneta.escrever("Olá Calleb");
            caneta.escreverComumATodas();
            System.out.println("Cor: " + caneta.getCor());

            ICaneta giz = new Giz();
            System.out.println("\n****** Giz ******");
            giz.escrever("Olá Calleb");
            giz.escreverComumATodas();
            System.out.println("Cor: " + giz.getCor());

            ICaneta lapis = new Lapis();
            System.out.println("\n****** Lapis ******");
            lapis.escrever("Olá Calleb");
            lapis.escreverComumATodas();
            System.out.println("Cor: " + lapis.getCor());

            ICarro carro = new CarroPasseio();
            System.out.println("\n****** Carro ******");
            carro.andar();
            carro.parar();

            ICarro caminhao = new Caminhao();
            System.out.println("\n****** Caminhão ******");
            caminhao.andar();
            caminhao.parar();
        }
    }
}
