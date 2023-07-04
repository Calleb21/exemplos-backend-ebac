package br.com.calleb.reflections.anotacao.cadastro.fabrica;

import br.com.calleb.reflections.anotacao.cadastro.domain.Persistence;
import br.com.calleb.reflections.anotacao.cadastro.exception.DadoInvalidosException;

public interface FabricaPersistente {

    /**
     * Método que sabe criar objetos da aplicação
     *
     * @param dados São os dados a serem cadastrados no banco de dados
     * @return Retorna o objeto <b>Persistente</b> que é pai de todas as entidades da aplicação
     * @throws DadoInvalidosException quando os dados estão inválidos
     */
    Persistence criarObjeto(String dados[]) throws DadoInvalidosException;
}
