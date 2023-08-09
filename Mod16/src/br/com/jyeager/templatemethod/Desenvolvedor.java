package br.com.jyeager.templatemethod;

public class Desenvolvedor extends Trabalhador{

    @Override
    protected void trabalhar() {
        print("3. Programando em Java;");
    }

    @Override
    protected void voltar() {
        print("Como o trabalho é Home Office, já estamos em casa.");
    }
}
