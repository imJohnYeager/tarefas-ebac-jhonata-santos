package br.jyeager.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_aluno")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="aluno_seq")
    @SequenceGenerator(name="aluno_seq", sequenceName = "sq_aluno", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "codigo", length = 10, nullable = false, unique = false)
    private String codigo;

    @Column(name = "nome", length = 50, nullable = false)
    private String nome;

    @OneToOne(mappedBy = "aluno")
    private Matricula matricula;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "tb_aluno_comput", joinColumns = {@JoinColumn(name = "id_aluno_fk")},
            inverseJoinColumns = {@JoinColumn(name = "id_computador_fk")})

    private List<Computador> computadores;
    public Aluno(){
        this.computadores = new ArrayList<Computador>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public List<Computador> getComputadores(){
        return computadores;
    }

    public void setComputadores(List<Computador> computadores) {
        this.computadores = computadores;
    }

    public void add(Computador comp){
        this.computadores.add(comp);
    }
}
