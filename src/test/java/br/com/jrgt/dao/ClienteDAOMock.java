package br.com.jrgt.dao;

import java.util.ArrayList;
import java.util.Collection;

import br.com.jrgt.cadastro.domain.Cliente;
import br.com.jrgt.dao.IClienteDAO;
import br.com.jrgt.exception.TipoChaveNaoEncontradaException;

public class ClienteDAOMock implements IClienteDAO {

	@Override
	public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void excluir(Long valor) {
		// TODO Auto-generated method stub
	}

	@Override
	public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
	}

	@Override
	public Cliente consultar(Long valor) {
		Cliente cliente = new Cliente();
		cliente.setCpf(valor);
		return cliente;
	}

	@Override
	public Collection<Cliente> buscarTodos() {
	    Collection<Cliente> lista = new ArrayList<>();

	    Cliente cliente1 = new Cliente();
	    cliente1.setCpf(1L);

	    Cliente cliente2 = new Cliente();
	    cliente2.setCpf(2L);

	    lista.add(cliente1);
	    lista.add(cliente2);

	    return lista;
	}
}
