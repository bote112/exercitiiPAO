package Lab7;

public class User {
    private final String name;
    private final String surname;
    private final String iban;

    public User(String name, String surname, String iban) {
        this.name = name;
        this.surname = surname;
        this.iban = iban;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIban() {
        return iban;
    }
}
