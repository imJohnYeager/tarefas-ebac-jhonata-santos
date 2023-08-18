package exercicio;

import java.util.List;

public class Listas {
    ListaPessoas app = new ListaPessoas();
    List<Pessoas> lista = new Pessoas().popularPessoas();
    public void  listaSexo() {
        lista.stream()
                .filter(pessoas -> pessoas.getSexo().equals(app.filtro))
                .forEach(p ->  System.out.println("\nObtendo dados de pessoas pelo filtro: " + app.filtro +
                        "\nNome: " + p.getNome() +
                        "\nNacionalidade: " + p.getNacionalidade() +
                        "\nIdade: " + p.getIdade() +
                        "\nSexo: " + p.getSexo()));
    }
    public void listaNacionalidade() {
        lista.stream()
                .filter(pessoas -> pessoas.getNacionalidade().equals(app.filtro))
                .forEach(p ->  System.out.println("\nObtendo dados de pessoas pelo filtro: " + app.filtro +
                        "\nNome: " + p.getNome() +
                        "\nNacionalidade: " + p.getNacionalidade() +
                        "\nIdade: " + p.getIdade() +
                        "\nSexo: " + p.getSexo()));
    }

}
