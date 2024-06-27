package br.com.ebac.animal.service.entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Funcionarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @OneToMany(mappedBy = "funcionarios")
    private List<Animal> animaisResgatados;
}
