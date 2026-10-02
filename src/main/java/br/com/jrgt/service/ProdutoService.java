package br.com.jrgt.service;

import br.com.jrgt.cadastro.domain.Produto;
import br.com.jrgt.dao.generic.IGenericDAO;
import br.com.jrgt.service.generic.GenericService;

public class ProdutoService extends GenericService<Produto> implements IProdutoService {

	public ProdutoService(IGenericDAO<Produto> dao) {
		super(dao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Produto buscarPorCodigo(Long codigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
