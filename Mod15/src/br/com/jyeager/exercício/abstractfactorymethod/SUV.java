package br.com.jyeager.exercício.abstractfactorymethod;

public class SUV implements ICarro {

    @Override
    public void dirigir() {
        System.out.println("Dirigindo o SUV " + marca + " " + modelo + " na cor " + cor);
    }

    private String marca;
    private String modelo;
    private String cor;

    public SUV(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }
}