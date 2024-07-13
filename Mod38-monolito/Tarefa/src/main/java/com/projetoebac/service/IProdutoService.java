package com.projetoebac.service;

import java.util.List;

import com.projetoebac.domain.Produto;
import com.projetoebac.service.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
