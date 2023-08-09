package exercicio;

class CarroNormal extends Carros<String> {
    public CarroNormal(String marca) {
        super(marca);
    }

    @Override
    public void start() {
        System.out.println("Carro de gasolina rodando...");
    }
}
