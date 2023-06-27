package br.com.jyeager.abstratas;

public class Horista extends Empregado {
    private Double precoHora;
    private Double horasTrabalhadas;

    @Override
    public Double vencimento() {
        return precoHora * horasTrabalhadas;
    }

    public Double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(Double precoHora) {
        this.precoHora = precoHora;
    }

    public Double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
