package Lab4.Tema;

record DebitCard(String utilizator, double limitAmount) implements BankCard {
    private static double spentAmount = 0;

    @Override
    public void doTransaction(double amount) {
        if (amount + spentAmount > limitAmount) {
            System.out.println("Not enough money.");
            return;
        }
        spentAmount += amount;
        System.out.println("Utilizator " + utilizator + " a cheltuit " + amount);
        System.out.println("Suma totala cheltuita cu carduri de debit este " + spentAmount);
    }
}
