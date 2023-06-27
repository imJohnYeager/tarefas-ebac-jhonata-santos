package br.com.jyeager.composicao;

public class App {
    public static void main(String args[]){
        Banco banco = new Banco();

        banco.setCodigo(20L);
        banco.setNome("Banco Yeager");

        ContaCorrente cc = new ContaCorrente();
        cc.setBanco(banco);
        cc.setSaldo(20d);

        ContaPoupanca cp = new ContaPoupanca();
        cp.setBanco(banco);
        cp.setSaldo(20d);
    }
}
