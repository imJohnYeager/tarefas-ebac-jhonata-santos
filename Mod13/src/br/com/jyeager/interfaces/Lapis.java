package br.com.jyeager.interfaces;

public class Lapis implements  ICaneta {
    @Override
    public void escrever(String texto) {
        System.out.println(texto);
    }

    @Override
    public String getColor() {
        return "Preto";
    }
}
