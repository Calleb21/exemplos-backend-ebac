package br.com.calleb;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author calle
 */
public class ExemplosOptional {

    public static void main(String[] args) {
        List<Pessoa> list = new Pessoa().popularPessoas();

        Optional<Pessoa> optional1 = list.stream()
                .max(Comparator.comparing(Pessoa::getId));

        if (optional1.isPresent()) {
            System.out.println(optional1.get());
        }

        System.out.println("");
        optional1.ifPresent(System.out::println);

        System.out.println("");

        Optional<Pessoa> min = list.stream()
                .min(Comparator.comparing(Pessoa::getIdade));

        min.ifPresentOrElse(System.out::println, new Runnable() {
            @Override
            public void run() {

            }
        });

        Pessoa value = min.orElseThrow();
    }
}
