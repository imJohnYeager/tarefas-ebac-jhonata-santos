package br.com.jyeager.exercício.abstractfactorymethod;

public class Hatchback implements ICarro {

    @Override
    public void dirigir() {
        System.out.println("Dirigindo o Hatchback " + marca + " " + modelo + " na cor " + cor);
    }

    private String marca;
    private String modelo;
    private String cor;

    public Hatchback(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }
}