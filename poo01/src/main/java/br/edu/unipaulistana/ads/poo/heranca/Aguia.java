package br.edu.unipaulistana.ads.poo.heranca;

public class Aguia extends Voador{
    @Override
    public void emitirSom() {
        System.out.println("barulho de aguis");
    }

    public void voar( int metros ){
        System.out.println("aguia voa " + metros + " metrosß");
    }
}
