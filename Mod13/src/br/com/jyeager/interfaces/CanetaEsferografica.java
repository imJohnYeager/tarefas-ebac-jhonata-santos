package br.com.jyeager.interfaces;

public class CanetaEsferografica implements ICaneta{
    @Override
    public void escrever(String texto) {
        System.out.println("Teste de interface " + texto + " em classe " + getClass().getSimpleName() + getClass());
    }

    @Override
    public String getColor() {
        return "Vermelho";
    }
}
