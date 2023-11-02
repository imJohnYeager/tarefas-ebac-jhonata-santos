package br.com.jyeager.tarefa03.listaEncadeada;

public class Metodos {
    MinhaListaEncadeada listaEncadeada = new MinhaListaEncadeada();

    /* adiciona um nó no início da lista. */
    public void push(Node node) {
        if (node != null) {
            System.out.println("Adicionando o nó '"+node.data+"' na lista.");
            node.next = listaEncadeada.head;
            listaEncadeada.head = node;
            listaEncadeada.tamanho++;
        }
    }

    public boolean isEmpty(){
        return listaEncadeada.tamanho == 0;
    }

    public int size() {
        System.out.println("O tamanho do Node é: "+listaEncadeada.tamanho);
        return listaEncadeada.tamanho;
    }

    /* remove o nó do início da lista e o retorna */
    public Node pop() {
        if (!isEmpty()) {
            System.out.println("Removendo o nó '"+ (listaEncadeada.head.data)+"'.");
            Node node = listaEncadeada.head;
            listaEncadeada.head = listaEncadeada.head.next;
            listaEncadeada.tamanho--;
            return node;
        } else {
            return null;
        }
    }

    /* insere um nó em uma posição específica da lista */
    public void insert(int index, Node node) {
        if (index >= 0 && index <= listaEncadeada.tamanho) {
            System.out.println("Inserindo o nó '"+node.data+"' na posição '"+index+"'.");
            if (index == 0) {
                push(node);
            } else {
                Node current = listaEncadeada.head;
                for (int i = 1; i < index; i++) {
                    current = current.next;
                }
                node.next = current.next;
                current.next = node;
                listaEncadeada.tamanho++;
            }
        } else {
            System.out.println("Índice fora dos limites.");
        }
    }

    /* remove um nó de uma posição específica na lista */
    public void remove(int index) {
        if (index >= 0 && index < listaEncadeada.tamanho) {
            System.out.println("Removendo o nó de posição '"+index+"'");
            if (index == 0) {
                listaEncadeada.head = listaEncadeada.head.next;
            } else {
                Node current = listaEncadeada.head;
                for (int i = 1; i < index; i++) {
                    current = current.next;
                }
                current.next = current.next.next;
            }
            listaEncadeada.tamanho--;
        } else {
            System.out.println("Índice fora dos limites.");
        }
    }

    /* retorna o nó em uma posição específica da lista */
    public Node elementAt(int index) {
        if (index >= 0 && index < listaEncadeada.tamanho) {
            Node current = listaEncadeada.head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        } else {
            System.out.println("Índice fora dos limites.");
            return null; // Ou escolha um valor padrão apropriado.
        }
    }

    /* imprime os elementos da lista encadeada */
    public void printList() {
        Node current = listaEncadeada.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
