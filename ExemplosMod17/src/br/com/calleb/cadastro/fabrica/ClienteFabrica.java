package br.com.calleb.cadastro.fabrica;

import br.com.calleb.cadastro.domain.Cliente;
import br.com.calleb.cadastro.domain.Persistente;

/**
 * @author calle
 *
 * Classe que representa a criação de objetos Cliente
 *
 */
public class ClienteFabrica implements FabricaPersistente{

    @Override
    public Persistente criarObjeto(String[] dadosSeparados) {
        return new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6] );
    }
}
