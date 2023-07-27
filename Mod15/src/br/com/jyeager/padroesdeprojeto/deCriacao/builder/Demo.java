package br.com.jyeager.padroesdeprojeto.deCriacao.builder;

public class Demo {

    public static void main(String[] args) {
        //Gerente gerente = new Gerente(new CheeseBurgerBuilder());
        Gerente gerente = new Gerente();
        gerente.setBuilder((new CheeseBurgerBuilder()));
        Burger play = gerente.buildBurger();
        play.print();

        //Gerente gerente1 = new Gerente(new VeganBurgerBuilder());
        gerente.setBuilder((new VeganBurgerBuilder()));
        Burger play1 = gerente.buildBurger();
        play1.print();

    }

}
