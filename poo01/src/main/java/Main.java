import br.edu.unipaulistana.ads.poo.heranca.*;

public class Main {
// CARRO, MOTO, ONIBUS, CAMIHAO BARCO, BICICRETINHA
    public static void main(String[] args) {
        Carro audi = new Carro("R8", "audi", "V8", 4, "automatico");
        System.out.println(audi);

        Carro fusca = new Carro("Fuscao vei", "Volkswagen", "boxter", 4, "manual");
        System.out.println(fusca);

        audi.frear();

        Moto hornet = new Moto("Honda", "CBR", "branca", 2014);
        hornet.correr();

        System.out.println(Moto.lugares);

            Moto.frear();

        new Calculator().genericMethod();

        Dog bob = new Dog();
        bob.emitirSom();
        bob.eat();
        bob.cagaeArrasta();

        Animal marley = new Cat();
        marley.emitirSom();
        marley.eat();

        Animal cow = new Cow();
        cow.emitirSom();
        cow.eat();

        Animal fish = new Fish();
        fish.emitirSom();
        fish.eat();

        Animal estranho = new Fish();

        Compra c = new Compra();
        c.pagar( new Dinheiro());
    }
}
