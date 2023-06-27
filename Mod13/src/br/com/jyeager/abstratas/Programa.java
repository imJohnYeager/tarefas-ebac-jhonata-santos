package br.com.jyeager.abstratas;

public class Programa {
    public static void main (String args[]) {
        Assalariado epgd = new Assalariado();
        epgd.setCpf("12345678910");
        epgd.setNome("Jhon");
        epgd.setSobrenome("Yeager");
        epgd.setSalario(1350d);
        print(epgd);

        Comissionado csnd = new Comissionado();
        csnd.setCpf("32165498732");
        csnd.setNome("Henrique");
        csnd.setSobrenome("Alberto");
        csnd.setTotalVenda(1000d);
        csnd.setTaxaComissao(0.1d);
        print(csnd);

        Horista hrt = new Horista();
        hrt.setCpf("15698524875");
        hrt.setNome("Bernardo");
        hrt.setSobrenome("Xavez");
        hrt.setPrecoHora(100d);
        hrt.setHorasTrabalhadas(40d);
        print(hrt);    }

    public static void print(Empregado funcionario) {
        //substitui o nome "funcionario" pelo nome que estiver em parênteses quando esta classe for usada.
        System.out.println("O salário de " + funcionario.getNome() + " como assalariado é: " + funcionario.vencimento());
        // Todas as classes herdam (extends) a instância "Empregado", por isso que funciona.
        funcionario.printSobrenome();
    }
}
