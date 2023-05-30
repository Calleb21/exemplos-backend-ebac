package br.com.calleb.ifelse;

import java.util.Scanner;

/**
 * @author calle
 */
public class ExemploIdade {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = s.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);
    }

    private static String getIdade(int idade) {
        if (idade >= 0 && idade <= 5){
            return "Você é um bebê.";
        } else if (idade >= 6 && idade <= 10) {
            return "Você é uma criança. ";
        } else if (idade >= 11 && idade <= 18) {
            return "Você é um adolescente. ";
        } else {
           return "Você é um adulto. ";
        }
    }
}
