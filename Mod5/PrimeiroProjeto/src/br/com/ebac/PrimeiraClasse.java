package br.com.ebac;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// Shift + espaço, Ctrl + clique no comando,
public class PrimeiraClasse {

    public static void main(String[] args) {
        String ambiente = args[0];
        System.out.println("\nHello World, John\n");
        if (ambiente.equalsIgnoreCase("DEV"))
            System.out.printf("Futuro Dev BackEnd em Java :)");
        if (!(ambiente.equalsIgnoreCase("DEV")))
        System.out.println("O argumento digitado é " + ambiente + ", digite 'dev' para ver outra mensagem.");

        }
    }