package br.com.jyeager.tarefa01.pilhas;

public class MinhaPilha {
    /* Definindo as propriedades da pilha */
    public int[] pilha;
    public int tamanho;
    public int topo;

    /* Construtor da pilha, necessário para definir os valores de inicialização */
    public MinhaPilha(int capacidade) {
        this.pilha = new int[capacidade];  /*Cria um array para armazenar os elementos da pilha
                                            com a capacidade especificada. */
        this.tamanho = 0;  // Inicializa o tamanho da pilha como 0 (a pilha está vazia no início).
        this.topo = -1;  // Inicializa o topo da pilha como -1 (indicando que a pilha está vazia no início).
    }
}
