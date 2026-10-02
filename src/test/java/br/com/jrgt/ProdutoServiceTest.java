package br.com.jrgt;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.jrgt.cadastro.domain.Produto;
import br.com.jrgt.dao.IProdutoDAO;
import br.com.jrgt.dao.ProdutoDAOMock;
import br.com.jrgt.exception.TipoChaveNaoEncontradaException;
import br.com.jrgt.service.IProdutoService;
import br.com.jrgt.service.ProdutoService;

public class ProdutoServiceTest {

	private IProdutoService produtoService; 
	
	private Produto produto;
	
	public ProdutoServiceTest() {
		IProdutoDAO dao = new ProdutoDAOMock();
		produtoService = new ProdutoService(dao);
	}
	
	@Before
	public void init() {
		produto = new Produto();
		produto.setCodigo(1234567890L);
		produto.setNome("Dell G15 5530");
	}
	
	@Test
	public void pesquisarproduto() {
		Produto produtoConsultado = produtoService.consultar(produto.getCodigo());
		Assert.assertNotNull(produtoConsultado);
	}
	
	@Test
	public void salvarProduto() throws TipoChaveNaoEncontradaException {
		Boolean retorno = produtoService.cadastrar(produto);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void alterarProduto() throws TipoChaveNaoEncontradaException {
		produto.setNome("Dell G15");
		produtoService.alterar(produto);
		Assert.assertEquals("Dell G15", produto.getNome());
	}
	
	@Test
	public void excluirProduto() {
		produtoService.excluir(produto.getCodigo());
	}
}
