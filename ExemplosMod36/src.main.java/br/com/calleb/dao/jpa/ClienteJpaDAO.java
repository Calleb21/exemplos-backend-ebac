package br.com.calleb.dao.jpa;

import br.com.calleb.dao.generic.GenericJpaDB1DAO;
import br.com.calleb.domain.ClienteJpa;

/**
 * Description of ClienteJpaDAO
 * Created by calle on 12/01/2024.
 */
public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

    public ClienteJpaDAO() {
        super(ClienteJpa.class);
    }
}
