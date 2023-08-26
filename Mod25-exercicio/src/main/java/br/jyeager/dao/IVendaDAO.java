package br.jyeager.dao;

import br.jyeager.dao.generic.IGenericDAO;
import br.jyeager.domain.Venda;
import br.jyeager.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
