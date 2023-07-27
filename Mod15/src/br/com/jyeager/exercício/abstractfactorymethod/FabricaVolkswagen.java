package br.com.jyeager.exercício.abstractfactorymethod;

public class FabricaVolkswagen implements  ICarroFactory{
    @Override
    public Sedan criarSedan() {
        return new Sedan("Volkswagen", "Virtus", "Azul");
    }

    @Override
    public Hatchback criarHatchback() {
        return new Hatchback("Volkswagen", "Gol", "Vermelho");
    }

    @Override
    public SUV criarSUV() {
        return new SUV("Volkswagen", "T-Cross", "Cinza");
    }
}