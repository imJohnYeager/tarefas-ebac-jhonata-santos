public class TesteExercicio {

    public static void main(String args[]) {
        // instanciando
        Cliente cliente = new Cliente();
        // irá imprimir a string que estiver em aspas
        System.out.println("Olá, John");
        cliente.cadastrarEndereco("Rua 1");
        cliente.setCodigo(1);
        System.out.println(cliente.getCodigo()  );
        //cliente.imprimirEndereco();
        String end = cliente.retornarNomeCliente();
        System.out.println(end);

    }
}
