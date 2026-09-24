package br.edu.unipaulistana.ads.poo.heranca;

public class Calculator {

    //SORECARGA de METODOS ou METHOD overloading
    int sum(int a, int b) {
        System.out.println("CHAMOU APORRA DO METODO COM INTEIRO");
        return a + b;
    }

    double sum( double a, double b){
        System.out.println("CHAMOU APORRA DO METODO COM DOUBLE");
        return a + b;
    }

    public void genericMethod(){
        double result = sum(1.0d, 2.0d);
    }
}