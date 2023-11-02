package br.com.jyeager.tarefa02.filas;
public class Metodos {

    MinhaFila f = new MinhaFila(10);

    public boolean isEmpty(){
        return f.tamanho == 0;
    }
    public void enqueue(int valor){
        if (f.tamanho < f.fila.length){
            System.out.println("Adicionando elemento na fila...");
            f.tras = (f.tras + 1) % f.fila.length;
            f.fila[f.tras] = valor;
            f.tamanho++;
        } else {
            System.out.println("A fila está cheia.");
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            System.out.println("Removendo elemento da fila FIFO...");
            int elemento = f.fila[f.frente];
            f.frente = (f.frente + 1) % f.fila.length;
            f.tamanho--;
            return elemento;
        } else {
            System.out.println("A fila está vazia.");
            return -1;
        }
    }

    public int rear() {
        if (!isEmpty()) {
            return f.fila[f.tras];
        } else {
            System.out.println("A fila está vazia.");
            return -1;
        }
    }

    public int front(){
        if (!isEmpty()){
            System.out.println("O valor que está na frente é: "+f.fila[f.frente]+ f.frente);
            return f.fila[f.frente];
        } else {
            System.out.println("A fila está vazia");
            return 0;
        }
    }

    public int size(){
        if (!isEmpty()){
            System.out.println("O tamanho da fila é: " + f.tamanho);
            return f.tamanho;
        } else {
            System.out.println("O tamanho da fila é 0.");
            return 0;
        }
    }

}
