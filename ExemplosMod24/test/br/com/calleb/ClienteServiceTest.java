package br.com.calleb;

import br.com.calleb.dao.ClienteDAO;
import br.com.calleb.dao.ClienteDAOMock;
import br.com.calleb.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        ClienteDAOMock mockDAO = new ClienteDAOMock();
        ClienteService service = new ClienteService(mockDAO);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNosalvarTest() {
        ClienteDAO clienteDAO = new ClienteDAO();
        ClienteService service = new ClienteService(clienteDAO);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
