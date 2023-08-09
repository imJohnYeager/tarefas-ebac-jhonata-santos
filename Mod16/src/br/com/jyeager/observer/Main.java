package br.com.jyeager.observer;

public class Main {
    public static void main(String args[]){
        Jornalista jor = new Jornalista();
        jor.add(new TV());
        jor.notifyAll("Testando");
    }
}