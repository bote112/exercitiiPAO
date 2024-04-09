package Lab7;

public class Tranzactie extends ConversieCalculImpl implements Cloneable {
    private final int id;
    private Payment payment;
    private final Currency currency = Currency.EUR;
    private double amount;
    private String refNmb;

    public Tranzactie(int id, Payment payment) {
        this.id = id;
        this.payment = payment;
        this.amount = conversieValutaToEur(payment.getAmount(), payment.getCurrency());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Tranzactie stornare() {
        Tranzactie tranzactieStornata = new Tranzactie(this.id, this.payment);
        tranzactieStornata.setAmount(-tranzactieStornata.getAmount());
        tranzactieStornata.setRefNmb(String.valueOf(this.id));
        return tranzactieStornata;
    }

    public int getId() {
        return id;
    }

    public Payment getPayment() {
        return payment;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

    public String getRefNmb() {
        return refNmb;
    }
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setRefNmb(String refNmb) {
        this.refNmb = refNmb;
    }

    @Override
    public String toString() {
        return "Tranzactie{" +
                "ID=" + id +
                ", Amount=" + amount +
                " EUR, Currency=" + payment.getCurrency() +
                ", User=" + payment.getUser().getName() +
                " " + payment.getUser().getSurname() +
                ", IBAN=" + payment.getUser().getIban() +
                ", Purpose='" + payment.getPurpose() + '\'' +
                ", RefNmb='" + (refNmb != null ? refNmb : "N/A") + '\'' +
                '}';
    }

}
