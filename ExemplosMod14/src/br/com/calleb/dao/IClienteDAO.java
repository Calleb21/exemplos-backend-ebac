package br.com.calleb.dao;

import br.com.calleb.domain.Cliente;

import java.util.Collection;

/**
 * @author calle
 */
public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente);
    public void excluir(Long cpf);
    public void alterar(Cliente cliente);
    public Cliente consultar(Long cpf);
    public Collection<Cliente> buscarTodos();
}
