// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Medias {

    public static void main(String args[]) {
        // instanciando as classes
        Portugues port = new Portugues();
        Matematica mat = new Matematica();
        System.out.println("*** BOLETIM ***\n\nPORTUGUÊS:\n1º Trimestre: " +
                port.portTrim1 + "\n2º Trimestre: " + port.portTrim2 + "\n3º Trimestre: " +
                port.portTrim3 + "\n4º Trimestre: " + port.portTrim4 + "\n---- Média: " +
                port.portSoma / 4.0 + "\n\n MATEMÁTICA: \n1º Trimestre: " +
                mat.matTrim1 + "\n2º Trimestre: " + mat.matTrim2 + "\n3º Trimestre: " +
                mat.matTrim3 + "\n4º Trimestre: " + mat.matTrim4 + "\n---- Média: " +
                mat.matSoma / 4.0);


    }


    public static class Portugues {
        public double portTrim1 = 2.5;
        public double portTrim2 = 8.9;
        public double portTrim3 = 6.0;
        public double portTrim4 =8.0;
        public double portSoma = portTrim1 + portTrim2 + portTrim3 + portTrim4;
    }

    public static class Matematica {
        public double matTrim1 = 5.0;
        public double matTrim2 = 6.1;
        public double matTrim3 = 7.0;
        public double matTrim4 = 4.0;
        public double matSoma = matTrim1 + matTrim2 + matTrim3 + matTrim4;
    }
}