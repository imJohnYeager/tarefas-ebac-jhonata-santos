package exercicio;

abstract class Carros<T> {
    private T marca;

    public Carros(T marca) {
        this.marca = marca;
    }

    public T getMarca() {
        return marca;
    }

    public abstract void start();
}
