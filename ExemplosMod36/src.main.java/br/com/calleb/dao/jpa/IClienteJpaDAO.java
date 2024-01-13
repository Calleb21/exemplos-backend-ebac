package br.com.calleb.dao.jpa;

import br.com.calleb.dao.generic.IGenericJapDAO;
import br.com.calleb.domain.Persistente;

/**
 * Description of IClienteJpaDAO
 * Created by calle on 12/01/2024.
 */
public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long> {

}
