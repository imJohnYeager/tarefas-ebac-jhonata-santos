package br.com.jyeager.templatemethod;

import java.util.Random;

public class Randomizacao {

    public static void rodarCodigo(){

        Random randomizar = new Random();
        Integer escolher = randomizar.nextInt(2);
        if (escolher == 0) {
            Trabalhador t = new Policial();
            t.executar();
        } else {
            Trabalhador t = new Desenvolvedor();
            t.executar();
        }
    }
}
