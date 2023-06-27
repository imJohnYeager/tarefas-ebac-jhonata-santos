package br.com.jyeager.composicao;

import java.util.HashSet;
import java.util.Set;

public class Banco {
    private Long codigo;
    private String nome;
    private Set<ContaCorrente> contasCorrente;
    private Set<ContaPoupanca> contasPoupanca;

    public Banco(){
        this.contasCorrente= new HashSet<>();
        this.contasPoupanca= new HashSet<>();
    }

    public void add(ContaCorrente cc){
        this.contasCorrente.add(cc);

    }
    public void add(ContaPoupanca cp){
        this.contasPoupanca.add(cp);

    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
