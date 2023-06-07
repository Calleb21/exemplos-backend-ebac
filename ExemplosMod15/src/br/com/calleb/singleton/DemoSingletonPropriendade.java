package br.com.calleb.singleton;

public class DemoSingletonPropriendade {

    public static void main(String[] args) {
        SingletonPropriedade singletonPropriedade = SingletonPropriedade.getInstance("Teste");
        SingletonPropriedade singletonPropriedade1 = SingletonPropriedade.getInstance("Teste1");

        System.out.println(singletonPropriedade.getValue());
        System.out.println(singletonPropriedade1.getValue());
    }
}
