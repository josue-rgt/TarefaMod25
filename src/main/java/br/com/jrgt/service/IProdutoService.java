package br.com.jrgt.service;

import br.com.jrgt.cadastro.domain.Produto;
import br.com.jrgt.exception.TipoChaveNaoEncontradaException;
import br.com.jrgt.service.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto>{

	public Boolean cadastrar(Produto produto) throws TipoChaveNaoEncontradaException;

	public Produto buscarPorCodigo(Long codigo);

	public void excluir(Long codigo);

	public void alterar(Produto produto) throws TipoChaveNaoEncontradaException;
}
