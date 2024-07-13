package com.projetoebac.dao;

import com.projetoebac.dao.generic.IGenericDAO;
import com.projetoebac.domain.Venda;

public interface IVendaDAO extends IGenericDAO<Venda, Long> {

	void finalizarVenda(Venda venda);

	void cancelarVenda(Venda venda);

	Venda consultarComCollection(Long id);

}
