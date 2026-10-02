package br.com.jrgt;

import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.jrgt.cadastro.domain.Cliente;
import br.com.jrgt.dao.ClienteDAO;
import br.com.jrgt.dao.ClienteDAOMock;
import br.com.jrgt.dao.IClienteDAO;
import br.com.jrgt.exception.TipoChaveNaoEncontradaException;

public class ClienteDAOTest {
	
	private IClienteDAO clienteDAO;
	
	private Cliente cliente;
	
	public ClienteDAOTest() {
		clienteDAO = new ClienteDAOMock();
	}
	
	@Before
	public void init() throws TipoChaveNaoEncontradaException {
	cliente = new Cliente();
	cliente.setNome("Josué");
	cliente.setCpf(1231231231L);
	cliente.setTel(123123123L);
	cliente.setEndereco("Rua End");
	cliente.setNumero(111);
	cliente.setCidade("Cidade");
	cliente.setEstado("São Paulo");
	clienteDAO.cadastrar(cliente);
	}

	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteDAO.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}

	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteDAO.cadastrar(cliente);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteDAO.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Josué Rogério");
		clienteDAO.alterar(cliente);
		Assert.assertEquals("Josué Rogério", cliente.getNome());
	}
	
	@Test
	public void buscarTodos() {
		Collection<Cliente> lista = clienteDAO.buscarTodos();
		
		assertTrue(lista != null);
		assertTrue(lista.size() == 2);
	}
}
