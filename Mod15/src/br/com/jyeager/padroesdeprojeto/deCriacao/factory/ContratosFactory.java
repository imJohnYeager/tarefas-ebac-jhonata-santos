package br.com.jyeager.padroesdeprojeto.deCriacao.factory;

public class ContratosFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if( "A".equals(requestedGrade)) {
            return new CorolaCar(100, "Cheio", "Preto");
        } else {
            return new FerrariCar(150, "Cheio", "Vermelho");
        }
    }
}
