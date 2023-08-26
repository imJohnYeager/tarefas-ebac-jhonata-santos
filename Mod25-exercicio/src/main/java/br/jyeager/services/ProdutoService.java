package br.jyeager.services;

import br.jyeager.dao.IProdutoDAO;
import br.jyeager.domain.Produto;
import br.jyeager.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
