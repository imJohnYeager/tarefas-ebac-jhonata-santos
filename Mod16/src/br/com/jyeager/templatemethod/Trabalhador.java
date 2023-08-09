package br.com.jyeager.templatemethod;

public abstract class Trabalhador {
    public void executar(){
        iniciarRotina();
        levantar();
        seArrumar();
        trabalhar();
        voltar();
    }
    public static void print(Object obj){System.out.println(obj);}

    protected void iniciarRotina(){
        print("Iniciando rotina como " + getClass().getSimpleName());
    }
    protected void levantar(){
        print("\n1. Levantando da cama;");
    }
    protected void seArrumar() {
        print("2. Se arrumando...;");
    }
    protected abstract void trabalhar();
    protected void voltar() {
        print("4. Voltando para casa.");
    }

}
