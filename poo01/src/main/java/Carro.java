public class Carro {
    String nome;
    String marca;
    String motor;
    int quantidadeRodas;
    String cambio;

    public Carro(String nome, String marca, String motor, int quantidadeRodas, String cambio){
        System.out.println("CRIANDO O MALDITO CARRO!");
        this.nome = nome;
        this.marca = marca;
        this.motor = motor;
        this.quantidadeRodas = quantidadeRodas;
        this.cambio = cambio;
    }

    public Carro(){
        System.out.println("CRIANDO COM O CONSTRUTOR PADRAO");
    }

    void andar(){
        System.out.println("ANDANDO CARAIß");
    }

    void frear(){
        System.out.println("FREEEEEEEIA");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", motor='" + motor + '\'' +
                ", quantidadeRodas=" + quantidadeRodas +
                ", cambio='" + cambio + '\'' +
                '}';
    }
}
