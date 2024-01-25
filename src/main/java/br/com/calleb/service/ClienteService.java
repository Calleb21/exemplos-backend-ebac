/**
 * 
 */
package br.com.calleb.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.calleb.dao.generic.IClienteDAO;
import br.com.calleb.domain.Cliente;
import br.com.calleb.exceptions.DAOException;
import br.com.calleb.exceptions.MaisDeUmRegistroException;
import br.com.calleb.exceptions.TableException;
import br.com.calleb.services.generic.GenericService;

/**
 * @author calleb
 *
 */
@Stateless
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

	@Inject
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
