package br.com.calleb.switchcase;

import java.util.Scanner;

public class ExemploScanner {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Você tem " + idade + " anos.");

        entrada.close();
    }
}
