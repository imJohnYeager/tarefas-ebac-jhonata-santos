// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Medias {

    public static void main(String args[]) {
        // instanciando as classes
        Materias.Portugues port = new Materias.Portugues();
        Materias.Matematica mat = new Materias.Matematica();
        System.out.println("*** BOLETIM ***\n\nPORTUGUÊS:\n1º Trimestre: " +
                port.portTrim1 + "\n2º Trimestre: " + port.portTrim2 + "\n3º Trimestre: " +
                port.portTrim3 + "\n4º Trimestre: " + port.portTrim4 + "\n---- Média: " +
                port.portSoma / 4.0 + "\n\n MATEMÁTICA: \n1º Trimestre: " +
                mat.matTrim1 + "\n2º Trimestre: " + mat.matTrim2 + "\n3º Trimestre: " +
                mat.matTrim3 + "\n4º Trimestre: " + mat.matTrim4 + "\n---- Média: " +
                mat.matSoma / 4.0);


    }

}