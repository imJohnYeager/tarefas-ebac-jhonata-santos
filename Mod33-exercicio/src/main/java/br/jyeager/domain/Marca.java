package br.jyeager.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_marca")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="marca_seq")
    @SequenceGenerator(name="marca_seq", sequenceName = "sq_marca", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "codigo", unique = false, nullable = false)
    private String codigo;

    @Column(name = "nome", unique = false, nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_marca_fk", foreignKey = @ForeignKey(name = "fk_marca_carro"),
            referencedColumnName = "id", nullable = false)

    private Carro carro;

    @OneToOne
    @JoinColumn(name = "id_Acessorio_fk", foreignKey = @ForeignKey(name = "fk_Acessorio_carro"),
            referencedColumnName = "id", nullable = false)
    private Acessorio Acessorio;


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

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public br.jyeager.domain.Acessorio getAcessorio() {
        return Acessorio;
    }

    public void setAcessorio(br.jyeager.domain.Acessorio acessorio) {
        Acessorio = acessorio;
    }
}
