package Lab7;

public class Payment {
    private final double amount;
    private final Currency currency;
    private final User user;
    private final String purpose;

    public Payment(double amount, Currency currency, User user, String purpose) {
        this.amount = amount;
        this.currency = currency;
        this.user = user;
        this.purpose = purpose;
    }

    public double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public User getUser() {
        return user;
    }

    public String getPurpose() {
        return purpose;
    }
}
