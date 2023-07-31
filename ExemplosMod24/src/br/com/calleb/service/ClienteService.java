package br.com.calleb.service;

import br.com.calleb.dao.ClienteDAO;
import br.com.calleb.dao.IClienteDAO;

/**
 * @author calle
 */
public class ClienteService {

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        //clienteDAO = new ClienteDAO();
        this.clienteDAO = clienteDAO;
    }

    public String salvar() {
        clienteDAO.salvar();
        return "Sucesso";
    }
}
