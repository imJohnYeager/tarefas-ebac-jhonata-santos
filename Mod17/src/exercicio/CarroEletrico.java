package exercicio;

class CarroEletrico extends Carros<String> {
    public CarroEletrico(String marca) {
        super(marca);
    }

    @Override
    public void start() {
        System.out.println("Carro elétrico rodando...");
    }
}
