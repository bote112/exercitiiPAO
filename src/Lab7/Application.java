package Lab7;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

import Lab7.Tranzactie;
import Lab7.User;
import Lab7.ConversieCalcul;
import Lab7.ConversieCalculImpl;
import Lab7.Payment;
import Lab7.Currency;
import Lab7.Tranzactie;

public class Application {
    private List<Tranzactie> tranzactii = new ArrayList<>();
    private int nextTranzactieId = 1;

    public static void main(String[] args) {

        Application app = new Application();

        User user1 = new User("Ion" , "Popescu" , "RO123321");

        app.procesarePlata(new Payment(150, Currency.USD, user1, "Online shopping"));
        app.procesarePlata(new Payment(200, Currency.RON, user1, "Bill"));
        app.procesarePlata(new Payment(50, Currency.GBP, user1, "Gift"));

        app.stornareTranzactie(2);

        System.out.println("Transactions after stornare:");
        app.afisareTranzactii();

        app.afisareTariPlati();

        app.afisareTranzactiiUser(user1);
    }

    private void procesarePlata(Payment payment) {
        Tranzactie tranzactie = new Tranzactie(nextTranzactieId, payment);
        tranzactii.add(tranzactie);
        nextTranzactieId++;

        System.out.println("Processed transaction: " + tranzactie);
    }


    private void stornareTranzactie(int tranzactieId) {
        tranzactii.stream()
                .filter(tranzactie -> tranzactie.getId() == tranzactieId)
                .findFirst()
                .ifPresent(tranzactieOriginala -> {
                    try {
                        Tranzactie tranzactieStornata = (Tranzactie) tranzactieOriginala.clone();
                        tranzactieStornata.setAmount(-tranzactieOriginala.getAmount());
                        tranzactieStornata.setRefNmb(String.valueOf(tranzactieOriginala.getId()));
                        tranzactii.add(tranzactieStornata);
                        System.out.println("Stornare transaction: " + tranzactieStornata);
                    } catch (CloneNotSupportedException e) {
                        System.out.println("Failed transaction");
                    }
                });
    }


    private void afisareTranzactii() {
        tranzactii.forEach(System.out::println);
    }

    private void afisareTariPlati() {
        System.out.println("Payments to the next countries:");
        tranzactii.stream()
                .map(tranzactie -> tranzactie.getPayment().getCurrency().getCountryName())
                .distinct()
                .forEach(System.out::println);
    }

    private void afisareTranzactiiUser(User user) {
        System.out.println("Transactions for user " + user.getName() + ":");
        tranzactii.stream()
                .filter(tranzactie -> tranzactie.getPayment().getUser().equals(user))
                .forEach(System.out::println);
    }
}

