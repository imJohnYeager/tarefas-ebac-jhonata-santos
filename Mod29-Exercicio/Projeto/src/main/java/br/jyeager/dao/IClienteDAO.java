package br.jyeager.dao;

import br.jyeager.domain.Cliente;

public interface IClienteDAO {

    Integer cadastrar(Cliente cliente) throws Exception;

    Cliente consultar(String codigo) throws Exception;

    Integer excluir(Cliente clienteBD) throws Exception;

}
