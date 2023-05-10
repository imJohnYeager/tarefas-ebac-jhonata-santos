package br.exercicio.com;
import java.util.Scanner;

public class Boletim {

    public static void main (String args[]){

    // Puxando as  classes de outro arquivo do mesmo pacote e instanciando o scanner
    MateriaScanner.Portugues pt = new MateriaScanner.Portugues();
    Scanner s = new Scanner(System.in);

    // escolha entre os dois métodos de boletim
    System.out.print("Olá, professor.\n\n1 = Boletim com Scanner;\n2 = Boletim sem Scanner;\nOpção: ");
    int reply = s.nextInt();


    // Se for com Scanner...
    if (reply == 1) {

        System.out.println("Insira a nota do 1º trimestre de português (exemplo: 5,0): ");
        double pt1 = s.nextDouble();

        System.out.println("Insira a nota do 2º trimestre de português (exemplo: 5,0): ");
        double pt2 = s.nextDouble();

        System.out.println("Insira a nota do 3º trimestre de português (exemplo: 5,0): ");
        double pt3 = s.nextDouble();

        System.out.println("Insira a nota do 4º trimestre de português (exemplo: 5,0): ");
        double pt4 = s.nextDouble();

        double portSoma = (pt1 + pt2 + pt3 + pt4) / 4.0;
        System.out.println("A sua média é: " + portSoma);

        if (portSoma >= 7) {
            System.out.println("Aluno Aprovado :)");
        }
        else if (portSoma >= 5) {
            System.out.println("Aluno em Recuperação :/");
        }
        else {
            System.out.println("Aluno Reprovado. Sinto muito :(");
        }

    }
    // Se for sem Scanner...
    else if (reply == 2) {
        System.out.println("*** BOLETIM ***\n\nPORTUGUÊS:\n1º Trimestre: " +
                pt.portTrim1 + "\n2º Trimestre: " + pt.portTrim2 + "\n3º Trimestre: " +
                pt.portTrim3 + "\n4º Trimestre: " + pt.portTrim4 + "\n---- Média: " +
                pt.portSoma / 4.0);

        if (pt.portSoma >= 7) {
            System.out.println("Aluno Aprovado :)");
        }
        else if (pt.portSoma >= 5) {
            System.out.println("Aluno em Recuperação :/");
        }
        else {
            System.out.println("Aluno Reprovado. Sinto muito :(");
        }
    }
    // Se for uma resposta não predefinida...
    else {
        System.out.println("Por favor, realize uma opção válida");
    }

    }
}
