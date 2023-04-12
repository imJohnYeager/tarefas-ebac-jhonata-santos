public class PrimeiraClasse {

    public static void main(String args[]) {
        Cliente cliente = new Cliente();
        System.out.println("Olá, John");
        cliente.cadastrarEndereco("Rua 1");
        cliente.setCodigo(1);
        System.out.println(cliente.getCodigo()  );
        //cliente.imprimirEndereco();
        String end = cliente.retornarNomeCliente();
        System.out.println(end);

    }
}
