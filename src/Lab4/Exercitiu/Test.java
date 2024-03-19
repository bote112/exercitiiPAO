package Lab4.Exercitiu;

public class Test {
    public static void main(String[] args) {
        Cerc cerc = new Cerc(5);

        System.out.println("Perimetrul cercului este: " + cerc.calculeazaPerimetru());

        Patrulater patrulater = new Patrulater(4, 4, 4, 4);

        System.out.println("Perimetrul patrulaterului este: " + patrulater.calculeazaPerimetru());

    }
}