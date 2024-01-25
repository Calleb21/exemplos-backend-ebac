/**
 * 
 */
package br.com.calleb.dao.generic;

import java.util.List;

import br.com.calleb.domain.Cliente;

/**
 * @author calleb
 *
 */
public interface IClienteDAO extends IGenericDAO<Cliente, Long> {

	List<Cliente> filtrarClientes(String query);

}