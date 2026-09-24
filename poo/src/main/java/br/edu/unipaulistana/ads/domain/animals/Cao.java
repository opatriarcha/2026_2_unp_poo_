package br.edu.unipaulistana.ads.domain.animals;

public class Cao extends AnimalTerrestre implements CapazDeNadar{

    @Override
    public void nadar() {
        System.out.println("NADANDO COMO UM CACHORRO");
    }

    @Override
    public void emitirSom(){
        System.out.println("AUAU");
    }
}
