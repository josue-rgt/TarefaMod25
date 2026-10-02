package br.com.jrgt;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.jrgt.cadastro.domain.Cliente;
import br.com.jrgt.cadastro.domain.Produto;
import br.com.jrgt.dao.IProdutoDAO;
import br.com.jrgt.dao.ProdutoDAOMock;
import br.com.jrgt.exception.TipoChaveNaoEncontradaException;

public class ProdutoDAOTest {
	
	private IProdutoDAO produtoDAO;
	
	private Produto produto;
	
	public ProdutoDAOTest () {
		produtoDAO = new ProdutoDAOMock();
	}
	
	@Before
	public void init() throws TipoChaveNaoEncontradaException{
		produto = new Produto();
		produto.setCodigo(1234567890L);
		produto.setNome("Dell G15 5530");
		produtoDAO.cadastrar(produto);
	}

	@Test
	public void pesquisarProduto() {
		Produto produtoConsultado = produtoDAO.consultar(produto.getCodigo());
		Assert.assertNotNull(produtoConsultado);
	}

	@Test
	public void salvarProduto() throws TipoChaveNaoEncontradaException {
		Boolean retorno = produtoDAO.cadastrar(produto);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirProduto() {
		produtoDAO.excluir(produto.getCodigo());
	}
	
	@Test
	public void alterarProduto() throws TipoChaveNaoEncontradaException {
		produto.setNome("Dell G15");
		produtoDAO.alterar(produto);
		Assert.assertEquals("Dell G15", produto.getNome());
	}
	
	@Test
	public void buscarTodos() {
		Collection<Produto> lista = produtoDAO.buscarTodos();
		
		assertTrue(lista != null);
		assertTrue(lista.size() == 2);
	}
}
