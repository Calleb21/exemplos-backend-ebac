package br.com.calleb.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *  É como um array cujo tamanho pode crescer.
 *  A busca de um elemento é rápida, mas inserções e exclusões não são.
 *
 * @author calle
 */

public class ExemploArrayList {

    public static void main(String[] args) {
        exemploNumeros();
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
    }

    private static void exemploNumeros() {
        System.out.println("****** exemploNumeros ******");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(6);
        System.out.println(numeros);
        System.out.println();
    }

    private static void exemploListaSimples() {
        System.out.println("****** exemploListaSimples ******");
        List<String> lista = new ArrayList<>();
        lista.add("João da Silva");
        lista.add("Antonio Souza");
        lista.add("Lúcia Ferreira");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("****** exemploListaSimplesOrdemAscendente *******");
        List<String> lista = new ArrayList<>();
        lista.add("João da Silva");
        lista.add("Antonio Souza");
        lista.add("Lúcia Ferreira");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
