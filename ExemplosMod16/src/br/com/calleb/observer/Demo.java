package br.com.calleb.observer;

public class Demo {

    public static void main(String[] args) {
        Jornalista jor = new Jornalista();

        jor.add(new TV());
        jor.add(new Jornal());
        jor.add(new Site());
        jor.notifyAll("Teste");
    }
}
