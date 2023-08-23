import br.jyeager.Listas;
import org.junit.Test;


public class ListaPessoas {
    String filtro = "Mulher";       /*Defini o filtro no próprio console para
                                     facilitar ao rodar o código, senão eu importaria a classe Scan.*/
@Test
    public static void main(String[] args) {
        Listas lst = new Listas();
        lst.listaSexo();
        lst.listaNacionalidade();
    }
}
