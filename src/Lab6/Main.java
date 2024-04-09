package Lab6;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

        public static void main(String[] args) {

                Proprietar proprietar1 = new Proprietar("Popescu", "Ion", 30);
                Proprietar proprietar2 = new Proprietar("Ionescu", "Maria", 25);
                Proprietar proprietar3 = new Proprietar("Georgescu", "Andrei", 35);
                Proprietar proprietar4 = new Proprietar("Popa", "Ana", 40);

                Magazin[] magazine = new Magazin[5];
                magazine[0] = new Magazin(1, "Auchan", proprietar1, 15000, 200);
                magazine[1] = new Magazin(2, "Zara", proprietar2, 20000, 150);
                magazine[2] = new Magazin(3, "H&M", proprietar2, 10000, 180);
                magazine[3] = new Magazin(4, "Bershka", proprietar2, 12000, 190);
                magazine[4] = new Magazin(5, "Lidl", proprietar3, 18000, 220);

                ShoppingMall sm = new ShoppingMall();

                for (Magazin magazin : magazine) {
                        sm.addMagazin(magazin);
                }

                CalculChirie chirieAlimentar = new MagazinAlimentar();
                CalculChirie chirieHaine = new MagazinHaine();
                CalculChirie chirieChimice = new MagazinChimicale();

                magazine[0].setChirie(chirieAlimentar);
                magazine[1].setChirie(chirieHaine);
                magazine[2].setChirie(chirieHaine);
                magazine[3].setChirie(chirieHaine);
                magazine[4].setChirie(chirieChimice);

                sortare(sm);
                sortareProprietari(sm, proprietar2);
                venitTotal(sm, proprietar2);
                chirieTotal(sm, proprietar2);

        }

        private static void sortare(ShoppingMall sm) {
                Collections.sort(sm.getMagazine(),
                                Comparator
                                                .comparing(Magazin::getProprietar,
                                                                Comparator.comparing(Proprietar::getNume)
                                                                                .thenComparing(Proprietar::getPrenume))
                                                .thenComparing(Magazin::getChirie));
                System.out.println("Magazinele sortate sunt:\n" + sm.getMagazine() + "\n");
        }

        private static void sortareProprietari(ShoppingMall sm, Proprietar proprietar) {
                List<Magazin> magazineByProprietar = sm.getMagazineByProprietar(proprietar);
                Collections.sort(magazineByProprietar, Comparator.comparing(Magazin::getNumeMagazin)
                                .thenComparing(Magazin::getVenit)
                                .thenComparing(Magazin::getChirie)
                                .thenComparing(Magazin::getSuprafata));

                System.out.println("Magazinele proprietarului " + proprietar.getNume() + " " + proprietar.getPrenume()
                                + " sunt:\n" + magazineByProprietar + "\n");
        }

        private static void venitTotal(ShoppingMall sm, Proprietar proprietar) {
                double total = sm.getMagazine().stream().filter(magazin -> magazin.getProprietar().equals(proprietar))
                                .mapToDouble(Magazin::getVenit).sum();

                System.out.println("Venitul total al proprietarului " + proprietar.getNume() + " "
                                + proprietar.getPrenume()
                                + " este: " + total + ".\n");
        }

        private static void chirieTotal(ShoppingMall sm, Proprietar proprietar) {
                double total = sm.getMagazine().stream().filter(magazin -> magazin.getProprietar().equals(proprietar))
                                .mapToDouble(Magazin::getChirie).sum();

                System.out.println(
                                "Chiria totala a proprietarului " + proprietar.getNume() + " " + proprietar.getPrenume()
                                                + " este: " + total + ".\n");
        }
}
