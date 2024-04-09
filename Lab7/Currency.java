package Lab7;

public enum Currency {
    RON("Romania", "RO"),
    USD("United States", "US"),
    GBP("Great Britain", "GB"),
    TRY("Turkey", "TR"),
    EUR("European Union", "EU");

    private final String countryName;
    private final String countryCode;

    Currency(String countryName, String countryCode) {
        this.countryName = countryName;
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }
}
