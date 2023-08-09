package br.com.jyeager.facade;

public class ApartamentService implements IApartamentService{

    public void procurarPorEndereco(){

    }
    public void procurarContato(){

    }
    public void procurarValorTotal(){

    }
    @Override
    public void alugarApartamento() {
        procurarPorEndereco();
        procurarContato();
        procurarValorTotal();
    }
}
