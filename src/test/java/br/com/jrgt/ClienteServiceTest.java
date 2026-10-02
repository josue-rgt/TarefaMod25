package br.com.jrgt;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.jrgt.cadastro.domain.Cliente;
import br.com.jrgt.dao.ClienteDAO;
import br.com.jrgt.dao.ClienteDAOMock;
import br.com.jrgt.dao.IClienteDAO;
import br.com.jrgt.exception.TipoChaveNaoEncontradaException;
import br.com.jrgt.service.ClienteService;
import br.com.jrgt.service.IClienteService;


public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDAOMock();
		clienteService = new ClienteService(dao);
	}
	
	//@Before - Executa antes de cada método @Test
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setNome("Josué");
		cliente.setCpf(1231231231L);
		cliente.setTel(123123123L);
		cliente.setEndereco("Rua End");
		cliente.setNumero(111);
		cliente.setCidade("Cidade");
		cliente.setEstado("São Paulo");
	}
 
	@Test
	public void pesquisarCliente() throws TipoChaveNaoEncontradaException {
		Cliente clienteConsultado = clienteService.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.cadastrar(cliente);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Josué Rogério");
		clienteService.alterar(cliente);
		Assert.assertEquals("Josué Rogério", cliente.getNome());
	}
}
