package br.com.jyeager.exercício.abstractfactorymethod;

public class FabricaToyota implements ICarroFactory{
    @Override
    public Sedan criarSedan() {
        return new Sedan("Toyota", "Corolla", "Prata");
    }

    @Override
    public Hatchback criarHatchback() {
        return new Hatchback("Toyota", "Yaris", "Branco");
    }

    @Override
    public SUV criarSUV() {
        return new SUV("Toyota", "RAV4", "Preto");
    }
}
