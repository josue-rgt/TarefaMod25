
package br.com.jrgt.service;

import br.com.jrgt.cadastro.domain.Cliente;
import br.com.jrgt.exception.TipoChaveNaoEncontradaException;
import br.com.jrgt.service.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente> {

	public Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	public Cliente buscarPorCpf(Long cpf);

	public void excluir(Long cpf);

	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;
}
