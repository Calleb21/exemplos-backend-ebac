package br.com.calleb;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.calleb.dao.CursoDao;
import br.com.calleb.dao.ICursoDao;
import br.com.calleb.domain.Curso;

public class CursoTest {
	
	private ICursoDao cursoDao;
	
	public CursoTest() {
		cursoDao = new CursoDao();
	}
	
	@Test
	public void cadastrar() {
		Curso curso = new Curso();
		curso.setCodigo("A1");
		curso.setDescricao("Curso Teste");
		curso.setNome("Curso de java Backend");
		cursoDao.cadastrar(curso);
		
		assertNotNull(curso);
		assertNotNull(curso.getId());
	}
}
