package br.edu.unipaulistana.ads.poo.heranca;

public class Debito extends MeioPagamento{
    @Override
    public void efetuarTransacao() {
        System.out.println("FAZER DEBITO");
    }
}
