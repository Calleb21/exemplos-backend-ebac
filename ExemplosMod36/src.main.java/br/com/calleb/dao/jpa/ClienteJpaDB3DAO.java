package br.com.calleb.dao.jpa;

import br.com.calleb.dao.generic.GenericJpaDB3DAO;
import br.com.calleb.domain.ClienteJpa2;

/**
 * Description of ClienteJpaDB3DAO
 * Created by calle on 12/01/2024.
 */
public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {

    public ClienteJpaDB3DAO() {
        super(ClienteJpa2.class);
    }
}
