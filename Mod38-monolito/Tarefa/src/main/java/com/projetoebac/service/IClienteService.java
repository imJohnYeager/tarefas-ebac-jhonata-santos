package com.projetoebac.service;

import java.util.List;

import com.projetoebac.domain.Cliente;
import com.projetoebac.exceptions.DAOException;
import com.projetoebac.service.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
