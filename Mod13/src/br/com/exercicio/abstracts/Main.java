package br.com.exercicio.abstracts;

public class Main {
    public static void main(String args[]) {
    Gato gt = new Gato();
    gt.setDono("Gaby");
    gt.setIdade(24);
    gt.setNome("Gordon");
    gt.setRaça("Storm");
    gt.setVacina("Gatocinol");
    gt.setMiado("Agudo");
    print(gt);
    System.out.println("Miado: " + gt.getMiado());

    Cachorro ccr = new Cachorro();
    ccr.setDono("John");
    ccr.setIdade(48);
    ccr.setNome("Bidu");
    ccr.setRaça("Poodle");
    ccr.setVacina("Cachorrocinol");
    ccr.setLatido("Agudo");
    print(ccr);
    System.out.println("Latido: " + ccr.getLatido());

    }
    public static void print(Animal classe){        // "Animal" é o nome da abstract class, "classe" é o denominador.
        System.out.println("\nPropriedade de " + classe.getDono() + ";\nNome do animal: " + classe.getNome() +
                ";\nPossui " + classe.getIdade() + " meses;\nRaça: " + classe.getRaça() + ";\nVacina:" +
                classe.getVacina() + ";");
    }
}