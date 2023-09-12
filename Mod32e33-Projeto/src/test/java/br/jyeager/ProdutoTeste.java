package br.jyeager;

import br.jyeager.dao.IProdutoDao;
import br.jyeager.dao.ProdutoDao;
import br.jyeager.domain.Produto;
import org.junit.Assert;
import org.junit.Test;

public class ProdutoTeste {

    private IProdutoDao produtoDao;
    public ProdutoTeste(){
        produtoDao = new ProdutoDao();
    }

    @Test
    public void estocar(){
        Produto produto = new Produto();

        produto.setCodigo("01");
        produto.setNome("Notebook");
        produto.setQuantidade(500);
        produto = produtoDao.estocar(produto);

        Assert.assertNotNull(produto);
        Assert.assertNotNull(produto.getId());
    }
}
