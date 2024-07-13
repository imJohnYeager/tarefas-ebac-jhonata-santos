package com.projetoebac.service;

import java.util.List;

import javax.inject.Inject;

import com.projetoebac.dao.IClienteDAO;
import com.projetoebac.domain.Cliente;
import com.projetoebac.exceptions.DAOException;
import com.projetoebac.exceptions.MaisDeUmRegistroException;
import com.projetoebac.exceptions.TableException;
import com.projetoebac.service.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

	private IClienteDAO clienteDAO;

	@Inject
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		this.clienteDAO = clienteDAO;
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Cliente> filtrarClientes(String query) {
		return clienteDAO.filtrarClientes(query);
	}

}
