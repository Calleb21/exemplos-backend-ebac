package br.com.calleb.cadastro.fabrica;

import br.com.calleb.cadastro.domain.Persistente;
import br.com.calleb.cadastro.domain.Produto;

public class ProdutoFabrica implements FabricaPersistente {

    @Override
    public Persistente criarObjeto(String[] dados) {
        Produto produto = new Produto();
        produto.setCodigo(Long.parseLong(dados[0].trim()));
        produto.setNome(dados[1]);
        return produto;
    }
}
