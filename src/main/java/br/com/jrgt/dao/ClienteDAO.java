 /**
 * 
 */
package br.com.jrgt.dao;

import br.com.jrgt.cadastro.domain.Cliente;
import br.com.jrgt.dao.generic.GenericDAO;

public class ClienteDAO extends GenericDAO<Cliente> implements IClienteDAO {
	
	public ClienteDAO() {
		super();
	}

	@Override
	public Class<Cliente> getTipoClasse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizarDados(Cliente entity, Cliente entityCadastrado) {
		// TODO Auto-generated method stub
	}
}
