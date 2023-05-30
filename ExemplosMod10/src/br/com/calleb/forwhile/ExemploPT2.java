package br.com.calleb.forwhile;

public class ExemploPT2 {

    public static void main(String[] args) {
        for (int contador = 1; contador <= 1000; contador++){
            System.out.println("Esta é a repetição nr: " + contador);
            if (contador == 27)
                break;
        }
    }
}
