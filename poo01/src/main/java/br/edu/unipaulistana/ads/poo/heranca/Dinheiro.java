package br.edu.unipaulistana.ads.poo.heranca;

public class Dinheiro extends MeioPagamento{
    @Override
    public void efetuarTransacao() {
        System.out.println("PAGO EM DINHEIRO");
    }
}
