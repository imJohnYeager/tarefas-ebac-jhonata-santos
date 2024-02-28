package com.jyeager;

import com.jyeager.tarefa01.calculadora.operacoes.Operacoes;

public class App
{
    public static void main( String[] args )
    {
        Operacoes op = new Operacoes();
        System.out.println( "** CALCULADORA **" );

        int a = 5;
        int b = 2;
        op.soma(a, b);
        op.divisao(a, b);
        op.multiplicacao(a, b);
        op.subtracao(a, b);
    }
}
