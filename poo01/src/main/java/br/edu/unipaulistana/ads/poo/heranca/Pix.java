package br.edu.unipaulistana.ads.poo.heranca;

public class Pix extends MeioPagamento{
    @Override
    public void efetuarTransacao() {
        System.out.println("FAZER PIX");
    }
}
