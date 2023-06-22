package br.com.calleb.generic;

import br.com.calleb.generic.fruita.Banana;
import br.com.calleb.generic.fruita.Fruta;
import br.com.calleb.generic.fruita.Maca;

import java.util.ArrayList;
import java.util.List;

/**
 * @author calle
 */
public class ExemploJavaGenerics {

    public static void main(String[] args) {
        List<String> lista = new ArrayList();
        System.out.println("List Array: ");
        lista.add("Calleb");
        lista.add("Camargo");
        imprimir(lista);

        System.out.println();

        List<Long> listaLong = new ArrayList();
        System.out.println("List Long: ");
        listaLong.add(1L);
        listaLong.add(2L);
        imprimir(listaLong);

        System.out.println("\nPrimeiro de ambas as listas: ");
        String primeiroSt = pegarPrimeiroLista(lista);
        System.out.println(primeiroSt);

        Long primeiroLg = pegarPrimeiroLista(listaLong);
        System.out.println(primeiroLg);

        Long primeiroLg2 = pegarPrimeiroListaLong(listaLong);
        System.out.println(primeiroLg2);

        imprimir2(listaLong);

        List<Fruta> frutas = new ArrayList<>();
        frutas.add(new Banana());
        frutas.add(new Maca());
        imprimirFrutas(frutas);
    }

    public static void imprimirFrutas(List<? extends Fruta> lista) {
        for (Fruta fruta : lista) {
            System.out.println(fruta);
        }
    }

    public static void imprimir2(List<?> lista) {
        for (Object obj : lista) {
            if (obj instanceof Long) {
                Long stlong = (Long) obj;
                System.out.println(stlong);
            }
            System.out.println("Qualquer coisa: " + obj);
        }
    }


    public static <T> void imprimir(List<T> lista) {
        for (T st : lista) {
            System.out.println(st);
        }
    }

    public static <T> T pegarPrimeiroLista(List<T> lista) {
        return lista.get(0);
    }

    public static <T> Long pegarPrimeiroListaLong(List<T> lista) {
        return (Long) lista.get(0);
    }
}
