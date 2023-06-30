package br.com.calleb.anatocao;

/**
 * @author calle
 */

@PrimeiraAnotacao(value = "Calleb", bairros = "Teste", numeroCasa = 10)
public class ClasseComAnotacao {

    @PrimeiraAnotacao(value = "Camargo", bairros = {"Teste", "Teste 1"}, numeroCasa = 20, valores = 100d)
    private String nome;

    @PrimeiraAnotacao(value = "Camargo", bairros = "Teste", numeroCasa = 20)
    public ClasseComAnotacao() {

    }
}
