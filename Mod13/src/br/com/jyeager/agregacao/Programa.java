package br.com.jyeager.agregacao;

public class Programa {

    public static void main(String args[]){
        Produto produtoNotebook = criarProduto(1L, 10d, "Notebook");
        Produto produtoMouse = criarProduto(2L, 6d, "Mouse");

        Vendedor vendedor = criarVendedor("John", 10d);

        Comprador comprador = criarComprador("Bruce", 18d);

        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.add(produtoNotebook);
        venda.add(produtoMouse);

        venda.concretizarVenda();

    }

    private static Comprador criarComprador(String nome, double verba) {
        return new Comprador(nome, verba);
    }

    private static Vendedor criarVendedor(String nome, double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setComissao(comissao);
        vendedor.setNome(nome);
        return vendedor;
    }

    public static Produto criarProduto(Long codigo, Double valor, String nome){
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setPreco(valor);
        produto.setNome(nome);
        return produto;
    }

}
