package com.jyeager.tarefas.tarefa02.topDown;

import java.util.HashMap;

public class App {

    // Usamos um HashMap para armazenar resultados já calculados
    private static HashMap<Integer, Long> memoizationMap = new HashMap<>();

    public static void main(String[] args) {
        // Exemplo de uso
        int numero = 7;
        long resultado = calcularFatorialTopDown(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }

    public static long calcularFatorialTopDown(int numero) {
        // Verifica se o resultado já foi calculado e armazenado no mapa
        if (memoizationMap.containsKey(numero)) {
            return memoizationMap.get(numero);
        }

        // Caso base: fatorial de 0 é 1
        if (numero == 0) {
            return 1;
        } else {
            // Chamada recursiva para calcular o fatorial
            long resultado = numero * calcularFatorialTopDown(numero - 1);

            // Armazena o resultado no mapa antes de retornar
            memoizationMap.put(numero, resultado);

            return resultado;
        }
    }
}