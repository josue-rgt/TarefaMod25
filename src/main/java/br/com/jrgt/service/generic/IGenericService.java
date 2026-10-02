package br.com.jrgt.service.generic;

import java.util.Collection;

import br.com.jrgt.cadastro.domain.Cliente;
import br.com.jrgt.cadastro.domain.Persistente;
import br.com.jrgt.exception.TipoChaveNaoEncontradaException;

public interface IGenericService<T extends Persistente> {
	
	public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

	public void excluir(Long valor);

	public void alterar(T entity) throws TipoChaveNaoEncontradaException;

	public T consultar(Long valor) ;
	
	public Collection<T> buscarTodos();
}
