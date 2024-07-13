package com.projetoebac.dao;

import java.util.List;

import com.projetoebac.dao.generic.IGenericDAO;
import com.projetoebac.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
