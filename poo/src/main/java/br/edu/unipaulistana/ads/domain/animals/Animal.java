package br.edu.unipaulistana.ads.domain.animals;

public abstract class Animal {

    private String name;
    private int age;
    private double size;

    public Animal( String name, int age ){
        this.name = name;
        this.age = age;
    }

    public Animal(){

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName( String name ){
        if( name == null || name.isBlank() )
            name = "sem nome ainda";
        this.name = name;
    }

    public void setAge( int age ){
        if( age < 0 )
            return;
        this.age = age;
    }

    public abstract void emitirSom();
}