package br.jyeager;

import br.jyeager.dao.ClienteDAO;
import br.jyeager.dao.IClienteDAO;
import br.jyeager.dao.IProdutoDAO;
import br.jyeager.domain.Cliente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    public void cadastrarTest() throws Exception {
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNome("Jhonata Santos");

        Integer qtd = dao.cadastrar(cliente);
        assertTrue(qtd == 1);

        Cliente clienteBD = dao.consultar("01");
        assertNotNull(clienteBD);
        assertNotNull(clienteBD.getId());
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        Integer qtdDel = dao.excluir(clienteBD);
        assertNotNull(qtdDel);
    }

    @Test
    public void cadastrarProdutoTest() throws Exception{
        IProdutoDAO produtoDAO = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("01");
        produto.setNome("Notebook");
        print("*** Cadastrando no banco de dados ***");
        Integer quantidade = produtoDAO.cadastrar(produto);
        assertTrue(quantidade == 1);
        print("Cadastrado com sucesso!");
        print("*** Consultando no banco de dados ***");
        Produto produtoDB = produtoDAO.consultar("01");
        assertNotNull(produtoDB);
        assertNotNull(produtoDB.getId());
        assertNotNull(produto.getCodigo(), produtoDB.getCodigo());
        assertEquals(produto.getNome(), produtoDB.getNome());
        print("Consultado com sucesso!");

        print("*** Deletando no banco de dados ***");
        Integer quantidadeDel = produtoDAO.excluir(produtoDB);
        assertNotNull(quantidadeDel);
        print("Deletado com sucesso!");

    }
    void print(Object mensagem){
        System.out.println(mensagem);
    }
}