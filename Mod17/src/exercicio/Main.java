package exercicio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carros<String>> carList = new ArrayList<>();

        CarroEletrico CarroEletrico = new CarroEletrico("Tesla");
        CarroNormal CarroNormal = new CarroNormal("Toyota");

        carList.add(CarroEletrico);
        carList.add(CarroNormal);

        for (Carros<String> carro : carList) {
            System.out.println("Marca: " + carro.getMarca());
            carro.start();
            System.out.println();
        }
    }
}
