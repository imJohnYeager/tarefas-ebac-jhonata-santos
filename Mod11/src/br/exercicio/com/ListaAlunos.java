package br.exercicio.com;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ListaAlunos {
    public static void main(String[] args) {
        alunos1();
        alunos2();


    }

    public static void alunos1() {
        String aluno1 = "Dionísio da Silva";
        String aluno2 = "Júlio Oliveira";
        String aluno3 = "Bianca Lee";
        String aluno4 = "Bernadete Santana";
        String aluno5 = "Paulo Pedroso";
        List<String> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno5);
        Collections.sort(alunos);
        System.out.println("\n||| ALUNOS 1 |||");
        System.out.println(alunos);
    }

    public static void alunos2() {
        List<String> alunos = new ArrayList<>();
        alunos.add("Bernardo da Silva - M");
        alunos.add("Olivia Oliveira - F");
        alunos.add("Rita Lee - F");
        alunos.add("Bernadete Santana - F");
        alunos.add("Paulo Pedroso - M");

        Collections.sort(alunos, (a1, a2) -> {
            String nomeAluno1 = a1.split("-")[1].trim();
            String nomeAluno2 = a2.split("-")[1].trim();
            return nomeAluno1.compareTo(nomeAluno2);
        });
        Collections.sort(alunos);

        System.out.println("\n||| ALUNOS 2 |||");
        System.out.println(alunos);
    }
}
