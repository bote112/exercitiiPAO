package Lab4.Tema;

public class Application {
    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard("Mihai Munteanu", 5000);
        CreditCard creditCard = new CreditCard("Andrei Popescu");

        ShoppingMall mall = new ShoppingMall(debitCard);
        mall.achizitie(3000);
        mall.achizitie(2500);

        mall.setCard(creditCard);
        mall.achizitie(4500);
    }
}
