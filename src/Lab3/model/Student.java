package Lab3.model;

public class Student extends Person {
    private int studentNumber;
    private double averageMark;
    private int clazz;

    // Constructor, getters and setters
    public Student(String name, String phoneNumber, String email, int studentNumber, double averageMark, int clazz) {
        super(name, phoneNumber, email);
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
        this.clazz = clazz;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public int getClazz() {
        return clazz;
    }

    @Override
    public String toString() {
        return "name: " + getName() + "\n" +
                "phone number: " + getPhoneNumber() + "\n" +
                "email: " + getEmail() + "\n" +
                "student number: " + studentNumber + "\n" +
                "average mark: " + averageMark + "\n" +
                "class: " + clazz;
    }
}
