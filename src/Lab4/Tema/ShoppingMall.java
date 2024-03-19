package Lab4.Tema;

class ShoppingMall {
    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void setCard(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void achizitie(double amount) {
        bankCard.doTransaction(amount);
    }
}
