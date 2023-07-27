package br.com.jyeager.exercício.abstractfactorymethod;

public interface ICarroFactory {
    Sedan criarSedan();
    Hatchback criarHatchback();
    SUV criarSUV();
}
