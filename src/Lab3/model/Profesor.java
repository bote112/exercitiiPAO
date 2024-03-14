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

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "name: " + name + "\n" +
                "phone number: " + phoneNumber + "\n" +
                "email: " + email + "\n" +
                "course: " + course + "\n" +
                "year: " + year;
    }
}