package br.com.ebac.animal.service.entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer     id;

    @Column(nullable = false)
    private String nomeProvisorio;

    @Column(nullable = false)
    private Integer idadeEstimada;

    @Column(nullable = false)
    private String Raca;

    @Column(nullable = false)
    private Date dataEntrada;

    @Column
    private Date dataAdocao;

    @Column(nullable = false)
    private String condicoesChegada;

    @Column(nullable = false)
    private String nomeRecebedor;

    @Column
    private Date dataObito;

    @Column(nullable = false)
    private String porte;

    @Column(nullable = false)
    private String especie;

    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionarios funcionarios;

}
