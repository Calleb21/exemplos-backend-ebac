package br.com.calleb.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * HashSet não tem ordem
 * O acesso aos dados é mais rápido que em um TreeSet, mas nada garante que os dados estarão ordenados.
 * Não repete valores na lista
 *
 * @author calle
 */
public class ExemploHashSet {

    public static void main(String[] args) {
        exemploListaSimples();
        exemploSimplesOrdemAscendente();
        exemploNovo();
    }

    private static void exemploNovo() {
        System.out.println("****** exemploNovo *******");
        Set<Integer> inteiros = new HashSet<>();
        inteiros.add(1);
        inteiros.add(2);
    }

    /**
     * Não repete valores na lista
     */
    private static void exemploListaSimples() {
        System.out.println("****** exemploListaSimples ******");
        Set<String> lista = new HashSet<>();
        lista.add("João Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        lista.add("João da Silva");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploSimplesOrdemAscendente() {
        System.out.println("****** exemploSimplesOrdemAscendente ******");
        Set<String> lista = new HashSet<String>();
        lista.add("João Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        //Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
