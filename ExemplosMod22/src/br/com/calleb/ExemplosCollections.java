package br.com.calleb;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author calle
 */
public class ExemplosCollections {

    public static void main(String[] args) {
        List<Pessoa> list = new Pessoa().popularPessoas();

        List<Pessoa> listaB = list.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toList());

        listaB.forEach(System.out::println);

        System.out.println("");

        list.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("");

        Set<Pessoa> set = list.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toSet());

        set.forEach(System.out::println);

        System.out.println("");

        ArrayList<Pessoa> arrayList = list.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toCollection(ArrayList::new));

        arrayList.forEach(System.out::println);

        System.out.println("");

//        TreeSet<Pessoa> tree = list.stream()
//                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
//                .collect(Collectors.toCollection(TreeSet::new));
//
//        tree.forEach(System.out::println);

       Map<Integer, Pessoa> map = list.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Argentina"))
                .collect(Collectors.toMap(Pessoa::getIdade, Pessoa::new));

        map.forEach((k, v) -> System.out.println(k + " / " + v));

        System.out.println("");

        Map<Integer, List<Pessoa>> agrupaPorIdade = list.stream()
//                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.groupingBy(Pessoa::getIdade));

        agrupaPorIdade.forEach((k, v) -> System.out.println(k + " / " + v));

        System.out.println("");

        Map<String, List<Pessoa>> grupoPorNacionalidade = list.stream()
                .collect(Collectors.groupingBy(Pessoa::getNacionalidade));

        grupoPorNacionalidade.forEach((k, v) -> System.out.println(k + " / " + v));

        System.out.println("");

        Map<String, Integer> grupoPorNacionalidadeSomadosIdades = list.stream()
                .collect(Collectors.groupingBy(Pessoa::getNacionalidade,
                        Collectors.summingInt(Pessoa::getIdade)));

        grupoPorNacionalidadeSomadosIdades.forEach((k, v) -> System.out.println(k + " / " + v));
    }
}
