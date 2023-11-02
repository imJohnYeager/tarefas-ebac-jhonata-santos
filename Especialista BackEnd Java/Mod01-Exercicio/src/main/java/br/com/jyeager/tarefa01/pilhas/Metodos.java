package br.com.jyeager.tarefa01.pilhas;

public class Metodos {

    // Cria uma instância da classe MinhaPilha e define sua capacidade.
    MinhaPilha p = new MinhaPilha(2);

    public boolean isEmpty(){

        return p.tamanho == 0;
    }

    // Método para adicionar (empilhar) um valor na pilha
    public void push(int valor) {
        if (p.tamanho < p.pilha.length) {  // Verifica se a pilha não está cheia
            p.pilha[++p.topo] = valor;    // Adiciona o valor ao topo da pilha e atualiza o topo
            p.tamanho++;                 // Incrementa o tamanho da pilha
            System.out.println("Valor '"+valor+"' adicionado.");
        } else {
            System.out.println("Impossível dar push em '"+valor+"'," +
                    " pois a pilha está cheia.");  // Exibe uma mensagem se a pilha estiver cheia
        }
    }

    public int pop(){
        if(!isEmpty()){
            System.out.println("Removendo valor '"+top()+"'...");
            p.tamanho--;
            return p.pilha[p.topo--];
        }else{
            System.out.println("A pilha está vazia");
            return -1;
        }
    }

    public int top() {
        if (!isEmpty()) {  // Verifica se a pilha não está vazia
            System.out.println("Observando o valor do topo: " + p.pilha[p.topo]);
            return p.pilha[p.topo];  // Retorna o valor no topo da pilha
        } else {
            System.out.println("A pilha está vazia");  // Exibe uma mensagem se a pilha estiver vazia
            return -1;  // Retorna um valor indicando que a pilha está vazia
        }
    }
    public int size() {
        if (!isEmpty()) {  // Verifica se a pilha não está vazia
            System.out.println("O tamanho da pilha é: " + p.tamanho);
            return p.tamanho;  // Retorna o tamanho atual da pilha
        } else {
            System.out.println("A pilha está vazia");  // Exibe uma mensagem se a pilha estiver vazia
            return -1;  // Retorna -1 para indicar que a pilha está vazia, como um valor de erro
        }
    }
}
