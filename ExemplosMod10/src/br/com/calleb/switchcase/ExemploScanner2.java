package br.com.calleb.switchcase;

import java.util.Scanner;

public class ExemploScanner2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("\nDigite sua altura: ");
        double altura = entrada.nextDouble();

        System.out.println(nome + " tem " + altura + "m de altura.");
        entrada.close();
    }
}
