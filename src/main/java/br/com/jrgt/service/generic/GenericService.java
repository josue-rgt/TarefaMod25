
package br.com.jrgt.service.generic;

import java.util.Collection;

import br.com.jrgt.cadastro.domain.Persistente;
import br.com.jrgt.dao.generic.IGenericDAO;
import br.com.jrgt.exception.TipoChaveNaoEncontradaException;

public class GenericService<T extends Persistente> implements IGenericService<T> {

	
	private IGenericDAO<T> dao;
	
	public GenericService(IGenericDAO<T> dao) {
		this.dao = dao;
	}

	@Override
	public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException {
		return this.dao.cadastrar(entity);
	}

	@Override
	public void excluir(Long valor) {
		this.dao.excluir(valor);
	}

	@Override
	public void alterar(T entity) throws TipoChaveNaoEncontradaException {
		this.dao.alterar(entity);
	}

	@Override
	public T consultar(Long valor) {
		return this.dao.consultar(valor);
	}

	@Override
	public Collection<T> buscarTodos() {
		return this.dao.buscarTodos();
	}
}
