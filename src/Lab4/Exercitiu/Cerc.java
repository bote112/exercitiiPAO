package Lab4.Exercitiu;

public class Cerc implements Calcul {
    private double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    @Override
    public double calculeazaPerimetru() {
        return 2 * Math.PI * raza;
    }

}
