package Lab4;

public class Test {
    public static void main(String[] args) {
        Cerc cerc = new Cerc(5);

        System.out.println("Perimetrul cercului este: " + cerc.calculeazaPerimetru());
        System.out.println("Aria cercului este: " + cerc.calculeazaArie());

        Patrulater patrulater = new Patrulater(4, 4, 4, 4);

        System.out.println("Perimetrul patrulaterului este: " + patrulater.calculeazaPerimetru());
        System.out.println("Aria patrulaterului este: " + patrulater.calculeazaArie());
    }
}
