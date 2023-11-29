package com.jyeager.tarefas.tarefa01;

public class FatorialRecursivo {

    public static void main(String[] args) {
        // Exemplo de uso
        double numero = 100;
        double resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }

    public static double calcularFatorial(double numero) {
        // Caso base: fatorial de 0 é 1
        if (numero == 0) {
            return 1;
        } else {
            // Chamada recursiva para calcular o fatorial
            return numero * calcularFatorial(numero - 1);
        }
    }
}