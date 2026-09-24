package br.edu.unipaulistana.ads.poo.heranca;

public abstract class Animal {
    String name;
    String raca;
    int age;
    String color;

    public abstract void emitirSom();

    public void eat(){
        System.out.println("Animal eatingß");
    }


}
