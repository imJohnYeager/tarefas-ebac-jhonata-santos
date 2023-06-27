package br.com.jyeager.interfaces;

public class Teste {
    public static void main(String args[]){
        ICaneta caneta = new CanetaEsferografica();
        // Instanciando a classe. a variável caneta receberá as informações da classe ao lado. (confirmar com o chatgpt).
        System.out.println("\n**** CLASSE CANETA ****");
        caneta.escrever("Olá John");
        caneta.novoMetodo();
        System.out.println(caneta.getColor());

        ICaneta giz = new Giz();
        System.out.println("\n**** CLASSE GIZ****");
        giz.escrever("Testando novamente");
        giz.novoMetodo();
        System.out.println(giz.getColor());

        ICaneta lapis = new Lapis();
        System.out.println("\n**** CLASSE LAPIS");
        lapis.escrever("Testando valor sem predefinir texto na classe Lapis.");
        lapis.novoMetodo();
        System.out.println(lapis.getColor());
    }

}