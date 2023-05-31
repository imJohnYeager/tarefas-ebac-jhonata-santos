package br.exercicio.com;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

// Criando a classe principal
public class SepararGenero {
    // Necessário para rodar o script
    public static void main(String[] args) {
        alunos();
    }

    // Subclass
    public static void alunos() {
        List<String> alunos = new LinkedList<>(); // Instanciando uma LinkedList
        alunos.add("Fernanda Souza - F");
        alunos.add("Lucas Mendes - M");
        alunos.add("Carolina Santos - F");
        alunos.add("Rafaela Oliveira - F");
        alunos.add("Pedro Henrique - M");

        Collections.sort(alunos, (a1, a2) -> {
            String nomeAluno1 = a1.split("-")[1].trim();
            String nomeAluno2 = a2.split("-")[1].trim();
            return nomeAluno1.compareTo(nomeAluno2);
        });
        Collections.sort(alunos);
        System.out.println(alunos);
    }
}
