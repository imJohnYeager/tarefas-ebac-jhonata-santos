package br.com.jyeager.exercício.abstractfactorymethod;

public class Sedan implements ICarro {

    @Override
    public void dirigir() {
        System.out.println("Dirigindo o Sedan " + marca + " " + modelo + " na cor " + cor);
    }

    private String marca;
    private String modelo;
    private String cor;

    public Sedan(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }
}