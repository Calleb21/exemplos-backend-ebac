package br.com.calleb.reflections.anotacao.cadastro.fabrica;

import br.com.calleb.reflections.anotacao.cadastro.domain.Persistence;
import br.com.calleb.reflections.anotacao.cadastro.domain.Produto;
import br.com.calleb.reflections.anotacao.cadastro.exception.DadoInvalidosException;

public class ProdutoFabrica implements FabricaPersistente {

    @Override
    public Persistence criarObjeto(String[] dados) throws DadoInvalidosException {
        try {
            Produto produto = new Produto();
            produto.setCodigo(Long.parseLong(dados[0].trim()));
            produto.setNome(dados[1]);
            return produto;
        } catch(IndexOutOfBoundsException e) {
            throw new DadoInvalidosException("Dados de produto estão inválidos");
        }
    }
}
