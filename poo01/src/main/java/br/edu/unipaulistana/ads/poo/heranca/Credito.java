package br.edu.unipaulistana.ads.poo.heranca;

public class Credito extends MeioPagamento{

    @Override
    public void efetuarTransacao() {
        System.out.println("FAZER CREDITO");
    }
}
