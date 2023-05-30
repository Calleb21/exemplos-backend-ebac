package br.com.calleb;

public class Exemplo2 {

    public static void main(String[] args) {

        int num1 = 10;
        short num2 = (short) num1;

        long numl = 1111111111111111l;
        System.out.println(numl);
        int numI = (int) numl;
        System.out.println(numI);

        int idade = 10;
        long idadel = idade;

        byte b = 1;
        short s = b;

        byte b1 = (byte) s;
        int i = b1;

        int i1 = 1;
        byte s1 = (byte) i1;
        long l = 1l;

        long l1 = 101020;
        short l2 = (short) l1;
        double d = l1;

        double d1 = 1.0d;
        long l3 = (long) d1;
    }
}
