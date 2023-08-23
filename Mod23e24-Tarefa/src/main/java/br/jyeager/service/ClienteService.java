package br.jyeager.service;

import br.jyeager.dao.ClienteDao;
import br.jyeager.dao.ClienteDaoMock;
import br.jyeager.dao.IClienteDao;


public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        //clienteDao = new ClienteDao();
        //clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }

    public String buscar() {
        clienteDao.buscar();
        return "Sucesso";
    }
}
