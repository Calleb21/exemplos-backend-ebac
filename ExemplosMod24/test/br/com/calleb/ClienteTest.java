package br.com.calleb;

import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {

    @Test
    public void testeClasseClienteNome() {
        Cliente cli = new Cliente();
        cli.adicionarNome("Calleb");
//        cli.adicionarIdade(19);

        Assert.assertEquals("Calleb", cli.getNome());
//        Assert.assertEquals(19, cli.getIdade());
    }
    @Test
    public void testeClasseClienteIdade() {
        Cliente cli = new Cliente();
//        cli.adicionarNome("Calleb");
        cli.adicionarIdade(19);

//        Assert.assertEquals("Calleb", cli.getNome());
        Assert.assertEquals(19, cli.getIdade());
    }
}
