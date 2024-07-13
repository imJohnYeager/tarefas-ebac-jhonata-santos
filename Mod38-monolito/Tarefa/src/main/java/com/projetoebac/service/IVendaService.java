package com.projetoebac.service;

import com.projetoebac.dao.generic.IGenericDAO;
import com.projetoebac.domain.Venda;

public interface IVendaService extends IGenericDAO<Venda, Long> {

	public void finalizarVenda(Venda venda);

	public void cancelarVenda(Venda venda);

	public Venda consultarComCollection(Long id);

}
