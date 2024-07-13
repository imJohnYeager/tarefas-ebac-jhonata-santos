package com.projetoebac.dao;

import java.util.List;

import com.projetoebac.dao.generic.IGenericDAO;
import com.projetoebac.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long> {

	List<Cliente> filtrarClientes(String query);

}
