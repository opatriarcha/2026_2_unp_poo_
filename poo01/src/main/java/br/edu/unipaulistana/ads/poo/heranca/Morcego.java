package br.edu.unipaulistana.ads.poo.heranca;

public class Morcego extends Voador{
    @Override
    public void emitirSom() {
        System.out.println("weeee");
    }

    public void voar( int metros ){
        System.out.println("Morcego voa " + metros + " metrosß");
    }
}
