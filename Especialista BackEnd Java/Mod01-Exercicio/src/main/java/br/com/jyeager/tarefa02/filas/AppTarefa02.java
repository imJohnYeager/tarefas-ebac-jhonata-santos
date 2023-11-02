package br.com.jyeager.tarefa02.filas;

public class AppTarefa02 {
    public static void main(String[] args){
        Metodos mtd = new Metodos();

        mtd.enqueue(1);
        mtd.front();
        mtd.enqueue(3);
        mtd.dequeue();
        mtd.size();
        mtd.rear();
        mtd.enqueue(5);
    }
}
