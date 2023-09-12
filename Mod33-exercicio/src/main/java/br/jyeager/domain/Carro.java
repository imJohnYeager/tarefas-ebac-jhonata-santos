package br.jyeager.domain;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "tb_carro")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="carro_seq")
    @SequenceGenerator(name="carro_seq", sequenceName = "sq_carro", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "codigo", unique = false, nullable = false)
    private String codigo;

    @Column(name = "km", unique = false, nullable = false)

    private String km;

    @Column(name = "tipo", unique = false, nullable = false)

    private String tipo;

    @OneToMany(mappedBy = "carro")
    private List<Marca> marcas;

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

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        tipo = tipo;
    }
}
