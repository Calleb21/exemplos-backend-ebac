package br.com.calleb.ifelse;

import java.util.Scanner;

public class ExemploAnimal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o nome de um animal: ");
        String texto = s.next();
        String animal = exampleOfIf(texto);
        System.out.println(animal);
    }

    private static String exampleOfIf(String animal) {
        String result;
        if (animal.equals("DOG") || animal.equals("CAT")) {
            result = "Domestic animal";
        } else if (animal.equals("TIGER")) {
            result = "Wild animal";
        } else {
            result = "Unknown animal";
        }
        return result;
    }
}
