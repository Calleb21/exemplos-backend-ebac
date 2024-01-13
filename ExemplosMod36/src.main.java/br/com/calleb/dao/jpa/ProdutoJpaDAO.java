package br.com.calleb.dao.jpa;

import br.com.calleb.dao.generic.GenericJpaDB1DAO;
import br.com.calleb.domain.ProdutoJpa;

/**
 * Description of ProdutoJpaDAO
 * Created by calle on 12/01/2024.
 */
public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class);
    }
}
