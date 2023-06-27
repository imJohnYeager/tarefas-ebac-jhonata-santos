package br.com.jyeager.interfaces;

public class Giz implements ICaneta{
    @Override
    public void escrever(String texto) {
        System.out.println("Testando novamente " + texto + " na classe " + getClass().getSimpleName());

    }

    @Override
    public String getColor() {
        return "Azul";
    }
}
