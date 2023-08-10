package br.com.yeager.exercicio;

public class Main {
    public static void main(String[] args) {
        // Obtendo a anotação da classe Cliente
        Tabela anotacao = Cliente.class.getAnnotation(Tabela.class);

        // Imprimindo o nome da tabela
        if (anotacao != null) {
            System.out.println("Nome da Tabela: " + anotacao.nome());
        } else {
            System.out.println("Anotação de Tabela não encontrada.");
        }
        System.out.println("Descrição: " + anotacao.descrição());
    }
}
