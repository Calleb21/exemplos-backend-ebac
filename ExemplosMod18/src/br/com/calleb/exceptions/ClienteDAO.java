package br.com.calleb.exceptions;

public class ClienteDAO {

    public static void consultarCliente(String codigo) throws ClienteNaoEncontradoException {
        //Buscar no banco
        boolean isCadastro = false;

        if (!isCadastro) {
            throw new ClienteNaoEncontradoException("Cliente não encontrado!");
        }
    }
}