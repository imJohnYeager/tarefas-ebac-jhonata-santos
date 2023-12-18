package com.jyeager.tarefas.tarefa01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        int[] conjunto1 = {1, 2, 3};
        int n1 = 2;
        List<List<Integer>> subconjuntos1 = gerarSubconjuntos(conjunto1, n1);
        System.out.println("Subconjuntos de tamanho " + n1 + " para " + Arrays.toString(conjunto1) + ": " + subconjuntos1);

        int[] conjunto2 = {1, 2, 3, 4};
        int n2 = 1;
        List<List<Integer>> subconjuntos2 = gerarSubconjuntos(conjunto2, n2);
        System.out.println("Subconjuntos de tamanho " + n2 + " para " + Arrays.toString(conjunto2) + ": " + subconjuntos2);
    }

    public static List<List<Integer>> gerarSubconjuntos(int[] conjunto, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        gerarSubconjuntosAux(conjunto, n, 0, subset, result);
        return result;
    }

    private static void gerarSubconjuntosAux(int[] conjunto, int n, int inicio, List<Integer> subset, List<List<Integer>> result) {
        if (subset.size() == n) {
            result.add(new ArrayList<>(subset));
            return;
        }

        for (int i = inicio; i < conjunto.length; i++) {
            subset.add(conjunto[i]);
            gerarSubconjuntosAux(conjunto, n, i + 1, subset, result);
            subset.remove(subset.size() - 1);
        }
    }
}