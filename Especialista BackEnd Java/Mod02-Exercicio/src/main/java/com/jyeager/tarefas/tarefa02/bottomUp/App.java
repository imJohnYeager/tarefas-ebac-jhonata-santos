package com.jyeager.tarefas.tarefa02.bottomUp;

public class App {

    public static void main(String[] args) {
        // Exemplo de uso
        int numero = 7;
        long resultado = calcularFatorialBottomUp(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }

    public static long calcularFatorialBottomUp(int numero) {
        // Cria um array para armazenar os resultados intermediários
        long[] resultados = new long[numero + 1];
        resultados[0] = 1; // Caso base: fatorial de 0 é 1

        // Preenche o array a partir do caso base até o número desejado
        for (int i = 1; i <= numero; i++) {
            resultados[i] = i * resultados[i - 1];
        }

        // O resultado final está no último elemento do array :D
        return resultados[numero];
    }
}