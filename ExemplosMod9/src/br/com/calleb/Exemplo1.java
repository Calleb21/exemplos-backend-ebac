package br.com.calleb;

public class Exemplo1 {

    public static void main(String[] args) {

        //Boxing
        Boolean status = true;
        Boolean status1 = Boolean.TRUE;

        Character c = 'A';

        Integer idade = 10;

        Long cpf = 12432433l;
        Long cpf1 = Long.valueOf(21324433);

        //unboxing
        boolean status2 = Boolean.TRUE;
        char letra = Character.valueOf('A');

        int idade2 = Integer.valueOf(12);

        long cpf3 = Long.valueOf(123456);
    }
}
