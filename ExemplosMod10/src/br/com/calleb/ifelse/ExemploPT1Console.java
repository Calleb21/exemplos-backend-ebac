package br.com.calleb.ifelse;

import java.util.Scanner;

public class ExemploPT1Console {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = s.nextInt();

        if (num == 1){
            System.out.println("Resultado igual a 1.");
        } else if (num > 1){
            System.out.println("Resultado maior que 1.");
        } else {
            System.out.println("Resultado menor que 1.");
        }
    }
}

