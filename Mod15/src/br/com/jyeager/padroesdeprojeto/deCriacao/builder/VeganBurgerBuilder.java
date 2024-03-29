package br.com.jyeager.padroesdeprojeto.deCriacao.builder;

public class VeganBurgerBuilder extends BurgerBuilder{
    @Override
    void buildBun() {
        burger.setBun("Vegan White Bread");
    }

    @Override
    void buildMeat() {
        burger.setMeat("Vegan Beef");
    }

    @Override
    void buildSalad() {
        burger.setSalad("Vegan Iceberg");
    }

    @Override
    void buildCheese() {
        burger.setCheese("Vegan American Cheese");
    }

    @Override
    void buildSauce() {
        burger.setSauce("Vegan Secret Sauce");
    }
}
