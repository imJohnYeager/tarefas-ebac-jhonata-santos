package br.com.jyeager.exercício.abstractfactorymethod;

public class Concessionaria {
    public static void main(String[] args) {
        ICarroFactory fabricaToyota = new FabricaToyota();
        ICarroFactory fabricaVolkswagen = new FabricaVolkswagen();

        ICarro sedanToyota = fabricaToyota.criarSedan();
        ICarro hatchbackToyota = fabricaToyota.criarHatchback();
        ICarro suvToyota = fabricaToyota.criarSUV();

        ICarro sedanVolkswagen = fabricaVolkswagen.criarSedan();
        ICarro hatchbackVolkswagen = fabricaVolkswagen.criarHatchback();
        ICarro suvVolkswagen = fabricaVolkswagen.criarSUV();

        sedanToyota.dirigir();
        hatchbackToyota.dirigir();
        suvToyota.dirigir();

        sedanVolkswagen.dirigir();
        hatchbackVolkswagen.dirigir();
        suvVolkswagen.dirigir();
    }
}
