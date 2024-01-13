package br.com.calleb.dao.generic;

import br.com.calleb.domain.Persistente;

import java.io.Serializable;

/**
 * Description of GenericJpaDB1DAO
 * Created by calle on 12/01/2024.
 */
public abstract class GenericJpaDB1DAO <T extends Persistente, E extends Serializable>
        extends GenericJpaDAO<T,E> {

    public GenericJpaDB1DAO(Class<T> persistenteClass) {
        super(persistenteClass, "Postgre1");
    }
}
