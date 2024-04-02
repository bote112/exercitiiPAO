package Lab6;

import Lab6.CalculChirie;

public class Magazin {
    private int id;
    private String numeMagazin;
    private Proprietar proprietar;
    private double venit;
    private double suprafata;
    private double chirie;

    public Magazin(int id, String numeMagazin, Proprietar proprietar, double venit, double suprafata) {
        this.id = id;
        this.numeMagazin = numeMagazin;
        this.proprietar = proprietar;
        this.venit = venit;
        this.suprafata = suprafata;
    }

    public double setChirie(CalculChirie cc) {
        this.chirie = cc.calculeazaChirie(suprafata);
        return this.chirie;
    }

    public double getChirie() {
        return chirie;
    }

    public int getId() {
        return id;
    }

    public String getNumeMagazin() {
        return numeMagazin;
    }

    public Proprietar getProprietar() {
        return proprietar;
    }

    public double getVenit() {
        return venit;
    }

    public double getSuprafata() {
        return suprafata;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumeMagazin(String numeMagazin) {
        this.numeMagazin = numeMagazin;
    }

    public void setProprietar(Proprietar proprietar) {
        this.proprietar = proprietar;
    }

    public void setVenit(double venit) {
        this.venit = venit;
    }

    public void setSuprafata(double suprafata) {
        this.suprafata = suprafata;
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "id=" + id +
                ", numeMagazin='" + numeMagazin + '\'' +
                ", proprietar=" + proprietar +
                ", venit=" + venit +
                ", suprafata=" + suprafata +
                ", chirie=" + chirie +
                '}';
    }
}
