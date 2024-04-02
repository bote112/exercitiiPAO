package Lab6;

import java.util.ArrayList;
import java.util.List;

public class ShoppingMall {

    private List<Magazin> magazine = new ArrayList<>();

    public void addMagazin(Magazin magazin) {
        magazine.add(magazin);
    }

    public void removeMagazin(Magazin magazin) {
        magazine.remove(magazin);
    }

    public List<Magazin> getMagazine() {
        return magazine;
    }

    public List<Magazin> getMagazineByProprietar(Proprietar proprietar) {
        List<Magazin> magazineByProprietar = new ArrayList<>();
        for (Magazin magazin : magazine) {
            if (magazin.getProprietar().equals(proprietar)) {
                magazineByProprietar.add(magazin);
            }
        }
        return magazineByProprietar;
    }

}
