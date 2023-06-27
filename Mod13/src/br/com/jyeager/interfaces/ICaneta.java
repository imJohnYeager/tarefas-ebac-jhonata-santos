package br.com.jyeager.interfaces;

public interface ICaneta {
    // criando interface pública + nome da interface antecedida por I.
    public void escrever(String texto);
    // nome da variável e o value que será inserido junto com o seu type.
    // String texto é o nome do que estará dentro da variável.

    public String getColor();

    default void novoMetodo(){
        // utilizado para executar em todas as classes, o valor será o mesmo.
        // a não ser que este método seja implementado manualmente na classe com outro valor.
        System.out.println("Testando novo método de interface a partir do Java 8");
    }
}
