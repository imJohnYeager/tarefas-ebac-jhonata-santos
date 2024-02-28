package com.jyeager.tarefa01.calculadora.operacoes;

public class Operacoes {
    /*
    Método de soma, onde irá somar as variáveis A e B.
     */
    public int soma(int a, int b){
        int soma = a + b;
        System.out.println("\n**** O resultado da soma de " +
                a + " mais " + b + " é: " + soma);
        return soma;
    }

    /*
    Método de subtração, onde irá subtrair as variáveis A e B.
     */
    public int subtracao(int a, int b){
        int sub = a - b;
        System.out.println("\n**** O resultado da subtração de " +
                a + " menos " + b + " é: " + sub);
        return sub;
    }

    /*
    Método de multiplicação, onde irá multiplicar as variáveis A e B.
     */
    public int multiplicacao(int a, int b){
        int multi = a * b;
        System.out.println("\n**** O resultado da multiplicação de " +
                a + " vezes " + b + " é: " + multi);
        return multi;
    }

    /*
    Método de divisão, onde ocorrerá divisão entre as variáveis A e B.
     */
    public int divisao(int a, int b){
        int div = a / b;
        System.out.println("\n**** O resultado da divisão de " +
                a + " dividido por " + b + " é: " + div);
        return div;
    }
}
