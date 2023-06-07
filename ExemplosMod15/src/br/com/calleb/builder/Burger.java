package br.com.calleb.builder;

public class Burger {

    private String bun = "No bun";
    private String meat = "No meat";
    private String salad = "No salad";
    private String cheese = "No cheese";
    private String sauce = "No sauce";

    public void setBun(String bun) {
        this.bun = bun;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setSalad(String salad) {
        this.salad = salad;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void print() {
        System.out.println(
                "Burger is finished! " + "n" +
                        "Bun: " + bun +
                        " - Meat: " + meat +
                        " - Cheese: " + cheese +
                        " - Salad: " + salad +
                        " - Sauce: " + sauce);
    }
}
