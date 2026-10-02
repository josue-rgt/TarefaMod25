/**
 * 
 */
package br.com.jrgt.service;

import br.com.jrgt.cadastro.domain.Cliente;
import br.com.jrgt.dao.ClienteDAO;
import br.com.jrgt.dao.IClienteDAO;
import br.com.jrgt.dao.generic.IGenericDAO;
import br.com.jrgt.exception.TipoChaveNaoEncontradaException;
import br.com.jrgt.service.generic.GenericService;

public class ClienteService extends GenericService<Cliente> implements IClienteService {

	public ClienteService(IGenericDAO<Cliente> dao) {
		super(dao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Cliente buscarPorCpf(Long cpf) {
		// TODO Auto-generated method stub
		return null;
	}
}
