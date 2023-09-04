package br.jyeager.dao;

import br.jyeager.Produto;

public interface IProdutoDAO {

    Integer cadastrar(Produto produto) throws Exception;

    Produto consultar(String number) throws Exception;

    Integer excluir(Produto produtoDB) throws Exception;
}
