public class Moto {
    String marca;
    String modelo;
    String cor;
    int ano;
    static int lugares = 2;

    public Moto(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    void correr(){
        System.out.println("VUTUTTUUTTU");
    }

    static void frear(){
        System.out.println("FREEEEEEEIA");
    }
}
