package br.com.jyeager.tarefa02.filas;

public class MinhaFila {
    public int[] fila;
    public int tamanho;
    public int frente;
    public int tras;

    public MinhaFila(int capacidade) {
        this.fila = new int[capacidade];
        this.tamanho = 0;
        this.frente = 0;
        this.tras = -1;
    }
}
