package br.com.calleb.dao.jpa;

import br.com.calleb.dao.generic.GenericJpaDB2DAO;
import br.com.calleb.domain.ClienteJpa;

/**
 * Description of ClienteJpaDB2DAO
 * Created by calle on 12/01/2024.
 */
public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

    public ClienteJpaDB2DAO() {
        super(ClienteJpa.class);
    }
}
