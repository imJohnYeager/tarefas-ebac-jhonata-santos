package br.com.jyeager.tarefa03.listaEncadeada;

public class AppTarefa03 {
    public static void main(String[] args){
        Metodos mtd = new Metodos();
        MinhaListaEncadeada lista = new MinhaListaEncadeada();

        Node novoNode = new Node(55);
        mtd.push(novoNode);
        mtd.size();
        Node novoNode1 = new Node(70);
        mtd.insert(0, novoNode1);
        mtd.pop();
        Node novoNode2 = new Node(444);
        mtd.push(novoNode2);
        mtd.remove(1);
    }
}
