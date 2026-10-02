package br.com.jrgt.dao;

import java.util.ArrayList;
import java.util.Collection;

import br.com.jrgt.cadastro.domain.Produto;
import br.com.jrgt.exception.TipoChaveNaoEncontradaException;

public class ProdutoDAOMock implements IProdutoDAO{

	@Override
	public Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void excluir(Long valor) {
		// TODO Auto-generated method stub
	}

	@Override
	public void alterar(Produto entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
	}

	@Override
	public Produto consultar(Long valor) {
		Produto produto = new Produto();
		produto.setCodigo(valor);
		return produto;
	}

	@Override
	public Collection<Produto> buscarTodos() {
		Collection<Produto> lista = new ArrayList();
		
		Produto produto1 = new Produto();
		produto1.setCodigo(12345L);
		
		Produto produto2 = new Produto();
		produto2.setCodigo(54321L);
		
		lista.add(produto1);
		lista.add(produto2);
		
		return lista;
	}
}
