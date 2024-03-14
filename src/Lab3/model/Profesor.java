package Lab3.model;

public class Profesor extends Person {
    private String course;
    private int year;

    // Constructor, getters and setters
    public Profesor(String name, String phoneNumber, String email, String course, int year) {
        super(name, phoneNumber, email);
        this.course = course;
        this.year = year;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "name: " + getName() + "\n" +
                "phone number: " + getPhoneNumber() + "\n" +
                "email: " + getEmail() + "\n" +
                "course: " + course + "\n" +
                "year: " + year;
    }
}