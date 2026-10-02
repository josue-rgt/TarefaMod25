package br.com.jrgt.dao;

import br.com.jrgt.cadastro.domain.Produto;
import br.com.jrgt.dao.generic.GenericDAO;

public class ProdutoDAO extends GenericDAO<Produto> implements IProdutoDAO {
	
	public ProdutoDAO() {
		super();
	}

	@Override
	public Class<Produto> getTipoClasse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizarDados(Produto entity, Produto entityCadastrado) {
		// TODO Auto-generated method stub
	}
}
