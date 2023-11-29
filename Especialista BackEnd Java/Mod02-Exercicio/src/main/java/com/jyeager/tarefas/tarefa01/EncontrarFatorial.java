package com.jyeager.tarefas.tarefa01;

public class EncontrarFatorial {

    /* Criando método com insercao de argumento chamado 'numero'*/
    public static double findFatorial(double numero) {
        /* usando o for (inicio, condicao, incremento/decremento) */
        for (double i = numero - 1; i > 0; --i) {
            System.out.println("Calculando: " + numero + " * " + i + " = " + numero * i);
            numero = numero * i;
            //return numero;
        }
        return numero;
    }
}
