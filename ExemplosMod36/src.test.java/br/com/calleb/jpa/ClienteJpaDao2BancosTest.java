package br.com.calleb.jpa;

import br.com.calleb.dao.jpa.ClienteJpaDAO;
import br.com.calleb.dao.jpa.ClienteJpaDB2DAO;
import br.com.calleb.dao.jpa.IClienteJpaDAO;
import br.com.calleb.domain.ClienteJpa;
import br.com.calleb.exceptions.DAOException;
import br.com.calleb.exceptions.MaisDeUmRegistroException;
import br.com.calleb.exceptions.TableException;
import br.com.calleb.exceptions.TipoChaveNaoEncontradaException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.Random;

/**
 * Description of ClienteJpaDao2BancosTest
 * Created by calle on 12/01/2024.
 */
public class ClienteJpaDao2BancosTest {

    private IClienteJpaDAO<ClienteJpa> clienteDao;

    private IClienteJpaDAO<ClienteJpa> clienteDB2Dao;

    private Random rd;

    public ClienteJpaDao2BancosTest() {
        this.clienteDao = new ClienteJpaDAO();
        this.clienteDB2Dao = new ClienteJpaDB2DAO();
        rd = new Random();
    }

    @After
    public void end() throws DAOException {
        Collection<ClienteJpa> list1 = clienteDao.buscarTodos();
        excluir1(list1);

        Collection<ClienteJpa> list2 = clienteDB2Dao.buscarTodos();
        excluir2(list2);
    }

    private void excluir1(Collection<ClienteJpa> list) {
        list.forEach(cli -> {
            try {
                clienteDao.excluir(cli);
            } catch (DAOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
    }

    private void excluir2(Collection<ClienteJpa> list) {
        list.forEach(cli -> {
            try {
                clienteDB2Dao.excluir(cli);
            } catch (DAOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
    }

    @Test
    public void pesquisarCliente() throws TipoChaveNaoEncontradaException, DAOException, MaisDeUmRegistroException, TableException, TableException {
        ClienteJpa cliente = criarCliente();
        clienteDao.cadastrar(cliente);

        ClienteJpa clienteConsultado = clienteDao.consultar(cliente.getId());
        Assert.assertNotNull(clienteConsultado);

        cliente.setId(null);
        clienteDB2Dao.cadastrar(cliente);

        ClienteJpa clienteConsultado2 = clienteDB2Dao.consultar(cliente.getId());
        Assert.assertNotNull(clienteConsultado2);

    }

    private ClienteJpa criarCliente() {
        ClienteJpa cliente = new ClienteJpa();
        cliente.setCpf(rd.nextLong());
        cliente.setNome("Rodrigo");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);
        return cliente;
    }
}
