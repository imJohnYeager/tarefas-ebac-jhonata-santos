package com.jyeager.tarefa01.calculadora;

import com.jyeager.tarefa01.calculadora.operacoes.Operacoes;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OperacoesTest {

    @Test
    public void testSoma() {
        Operacoes op = new Operacoes();
        int resultado = op.soma(5, 3);
        assertEquals(8, resultado);
    }

    @Test
    public void testSubtracao() {
        Operacoes op = new Operacoes();
        int resultado = op.subtracao(10, 4);
        assertEquals(6, resultado);
    }

    @Test
    public void testMultiplicacao() {
        Operacoes op = new Operacoes();
        int resultado = op.multiplicacao(3, 5);
        assertEquals(15, resultado);
    }

    @Test
    public void testDivisao() {
        Operacoes op = new Operacoes();
        int resultado = op.divisao(10, 2);
        assertEquals(5, resultado);
    }
}

