package br.com.calleb.switchcase;

import java.util.Scanner;

/**
 * @author calle
 */
public class ExemploAnimal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome de um animal: ");
        String texto = s.next();
        String animal = exampleOfSwitch(texto);
        System.out.println(animal);
        }

    private static String exampleOfSwitch(String animal) {
        String result;
        switch (animal) {
            case "DOG" :
            case "CAT" :
                result = "Domestic animal";
                break;
            case "TIGER" :
                result = "Wild animal";
                break;
            default:
                result = "Unknown animal";
                break;
        }
        return result;
    }
}

