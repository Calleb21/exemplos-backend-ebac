package br.com.calleb;

import br.com.calleb.dao.ContratoDAO;
import br.com.calleb.dao.IContratoDAO;
import br.com.calleb.dao.mock.ContratoDAOMock;
import br.com.calleb.service.ContratoService;
import br.com.calleb.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;


/**
 * @author calle
 */
public class ContratoServiceTest {

    @Test
    public void salvarTeste() {
        IContratoDAO dao = new ContratoDAOMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDados() {
        IContratoDAO dao = new ContratoDAO();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}

