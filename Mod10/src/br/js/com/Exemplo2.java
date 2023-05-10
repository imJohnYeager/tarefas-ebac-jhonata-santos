package br.js.com;

// deve-se importar o pacote em que se localiza o scanner
import java.util.Scanner;

public class Exemplo2 {


    public static void main(String args[]) {

        Scanner s = new Scanner (System.in); //"s" é a variável. precisa instanciar sempre o Scanner
        System.out.printf("Informe um valor: ");

        int result = s.nextInt(); //"nextInt" pois o valor será em tipo int

        if (result >= 35 && result <= 50) {
            System.out.println("\nO resultado está entre 35 e 50");}
        else if (result >=20 && result < 35) {
            System.out.println("\nO resultado está entre 20 e 34");}
        else {
            System.out.println("\nO resultado é diferente do predefinido");}
            }


        }