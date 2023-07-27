package br.com.jyeager.padroesdeprojeto.deCriacao.factory;

public class SemContratosFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new BrasiliaCar(87, "Metade", "Amarelo");
        } else {
            return null;
        }
    }
}