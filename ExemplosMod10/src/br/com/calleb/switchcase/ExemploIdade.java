package br.com.calleb.switchcase;

import java.util.Scanner;

public class ExemploIdade {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);
    }

    public static String getIdade(int idade) {
        String result;
        switch (idade) {
            case 0 :
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                result = "Você é um bebê.";
                break;
            case 6 :
            case 7 :
            case 8 :
            case 9 :
            case 10 :
                result = "Você é uma criança.";
                break;
            case 11 :
            case 12 :
            case 13 :
            case 14 :
            case 15 :
            case 16 :
            case 17 :
            case 18 :
                result = "Você é um adolescente.";
                break;
            default:
                result = "Você é um adulto";
                break;
        }
        return result;
    }
}
