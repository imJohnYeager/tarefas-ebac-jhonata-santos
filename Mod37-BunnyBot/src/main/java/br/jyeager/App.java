package br.jyeager;

public class App {
    public static void main(String[] args) {

        OpcoesDeLogin logar = new OpcoesDeLogin();
        System.out.println("\nTestando código...");
        logar.LogarQRCode();
        System.out.println("\nTeste concluído");

    }
}