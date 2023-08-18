package exercicio;

import java.util.List;
import java.util.Objects;

public class Pessoas {

    private String id;
    private String nome;
    private String nacionalidade;
    private int idade;
    private String sexo;
    public Pessoas() {

    }

    public Pessoas(String id, String nome, String nacionalidade, int idade, String sexo) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Pessoas(Pessoas pessoa) {
        this(pessoa.getId(), pessoa.getNome(), pessoa.getNacionalidade(), pessoa.getIdade(), pessoa.getSexo());
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<Pessoas> popularPessoas() {
        Pessoas pessoa1 = new Pessoas("p1", "Isabella Santos", "Brasil", 25, "Mulher");
        Pessoas pessoa2 = new Pessoas("p2", "Alejandro Gutierrez", "Mexico", 29, "Homem");
        Pessoas pessoa3 = new Pessoas("p3", "Emily Thompson", "Canadá", 31, "Mulher");
        Pessoas pessoa4 = new Pessoas("p4", "Lucas Rodrigues", "Brasil", 28, "Homem");
        Pessoas pessoa5 = new Pessoas("p5", "Sophia Martinez", "Espanha", 24, "Mulher");
        Pessoas pessoa6 = new Pessoas("p6", "Raj Patel", "Índia", 30, "Homem");
        Pessoas pessoa7 = new Pessoas("p7", "Olga Petrov", "Rússia", 27, "Mulher");
        Pessoas pessoa8 = new Pessoas("p8", "Liam O'Connor", "Irlanda", 26, "Homem");

        return List.of(pessoa1,pessoa2,pessoa3,pessoa4, pessoa5, pessoa6, pessoa7, pessoa8);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoas pessoa = (Pessoas) o;
        return id.equals(pessoa.id) && nome.equals(pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Pessoas{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                '}';
    }
}
