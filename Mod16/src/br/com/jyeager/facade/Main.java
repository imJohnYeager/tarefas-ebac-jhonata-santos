package br.com.jyeager.facade;

public class Main {
    public static void main(String[] args){
        IApartamentService service = new ApartamentService();
        service.alugarApartamento();
    }
}
