package com.jyeager.tarefas.tarefa02;

public class DarTroco {

    public static void main(String[] args) {
        int[] moedasDisponiveis = {5, 2, 1};
        int quantia = 18;

        System.out.println("Dar troco de " + quantia + ":");
        darTroco(quantia, moedasDisponiveis);
    }

    public static void darTroco(int quantia, int[] moedas) {
        for (int moeda : moedas) {
            if (quantia >= moeda) {
                int quantidade = quantia / moeda;
                System.out.println(quantidade + " moeda(s) de " + moeda);
                quantia %= moeda; // Atualiza a quantia para o restante
            }
        }
    }
}
