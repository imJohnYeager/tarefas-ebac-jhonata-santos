public class ConversaoWrapper {

    public static void main(String[] args) {

        Primitivo primitivo = new Primitivo();

        // convertendo byte para Byte
        Byte byteWrapper = Byte.valueOf(primitivo.byte1);
        System.out.println("byte1: " + primitivo.byte1 + " -> Byte: " + byteWrapper);

        // convertendo short para Short
        Short shortWrapper = Short.valueOf(primitivo.short1);
        System.out.println("short1: " + primitivo.short1 + " -> Short: " + shortWrapper);

        // convertendo int para Integer
        Integer intWrapper = Integer.valueOf(primitivo.int1);
        System.out.println("int1: " + primitivo.int1 + " -> Integer: " + intWrapper);

        // convertendo float para Float
        Float floatWrapper = Float.valueOf(primitivo.float1);
        System.out.println("float1: " + primitivo.float1 + " -> Float: " + floatWrapper);

        // convertendo double para Double
        Double doubleWrapper = Double.valueOf(primitivo.double1);
        System.out.println("double1: " + primitivo.double1 + " -> Double: " + doubleWrapper);

    }

    public static class Primitivo {

        public byte byte1 = 22;
        public short short1 = 2004;
        public int int1 = 2004200420;
        public float float1 = 20.04F;
        public double double1 = 2004.2004;

    }
}
