package br.edu.unipaulistana.ads.poo.heranca;

public class Boleto extends MeioPagamento{
    @Override
    public void efetuarTransacao() {
        System.out.println("FAZER deposito do boleto");
    }
}
