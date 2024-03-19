package Lab4.Exercitiu;

public class Patrulater implements Calcul {
    private double latura1;
    private double latura2;
    private double latura3;
    private double latura4;

    public Patrulater(double latura1, double latura2, double latura3, double latura4) {
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
        this.latura4 = latura4;
    }

    @Override
    public double calculeazaPerimetru() {
        return latura1 + latura2 + latura3 + latura4;
    }

}
