package br.com.calleb.reflections.anotacao.cadastro.fabrica;

import br.com.calleb.reflections.anotacao.cadastro.domain.Cliente;
import br.com.calleb.reflections.anotacao.cadastro.domain.Persistence;
import br.com.calleb.reflections.anotacao.cadastro.exception.DadoInvalidosException;

public class ClienteFabrica implements FabricaPersistente {

    @Override
    public Persistence criarObjeto(String dadosSeparados[]) throws DadoInvalidosException {
        try {
            return new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]);
        } catch (IndexOutOfBoundsException e) {
            throw new DadoInvalidosException("Dados de cliente estão inválidos");
        }
    }
}
