package Lab7;

public class ConversieCalculImpl implements ConversieCalcul {
    @Override
    public double conversieValutaToEur(double amount, Currency currency) {
        double cantitate;
        switch (currency) {
            case USD ->
                cantitate = amount * 0.9;
            case RON ->
                cantitate = amount * 0.2;
            case GBP ->
                cantitate = amount * 1.1;
            case TRY ->
                cantitate = amount * 0.05;
            case EUR ->
                cantitate = amount;
            default:throw new IllegalArgumentException("Currency not supported for conversion: " + currency);
        }
        return cantitate;
    }

    @Override
    public void calculRata() {
    }
}
