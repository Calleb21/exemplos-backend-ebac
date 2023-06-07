package br.com.calleb.builder;

public class Demo {

    public static void main(String[] args) {
        //Gerente gerente = new Gerente(new CheseBurgerBuilder());
        Gerente gerente = new Gerente();
        gerente.setBuilder(new CheeseBurgerBuilder());
        Burger burger = gerente.buildBurger();
        burger.print();

        gerente.setBuilder(new VeganBurgerBuildr());
        Burger burger1 = gerente.buildBurger();
        burger1.print();
    }
}
