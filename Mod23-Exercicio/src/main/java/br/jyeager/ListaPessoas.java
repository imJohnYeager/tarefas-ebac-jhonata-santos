package br.jyeager;

public class ListaPessoas {
    public String filtro = "Mulher";       /*Defini o filtro no próprio console para
                                     facilitar ao rodar o código, senão eu importaria a classe Scan.*/

    public static void main(String[] args) {
        Listas lst = new Listas();
        lst.listaSexo();
        lst.listaNacionalidade();
    }
}
