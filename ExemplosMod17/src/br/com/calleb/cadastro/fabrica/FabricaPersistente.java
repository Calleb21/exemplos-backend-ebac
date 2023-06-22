package br.com.calleb.cadastro.fabrica;

import br.com.calleb.cadastro.domain.Persistente;

/**
 * @author calle
 *
 * Fábrica que sabe criar objetos da aplicação
 */
public interface FabricaPersistente {

    /**
     *  Método que sabe criar objetos da aplicação
     *
     * @param dados são os dados a serem cadastrados no banco de dados
     * @return Retorna o objeto <b>Persistente</> que é pai de todos as entidades da aplicação
     */

    Persistente criarObjeto(String dados[]);
}
