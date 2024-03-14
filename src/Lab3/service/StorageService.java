package Lab3.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import Lab3.model.Profesor;
import Lab3.model.Student;

public class StorageService {
    private List<Student> students = new ArrayList<>();
    private List<Profesor> professors = new ArrayList<>();

    public void create(Scanner scanner) {
        System.out.println("Enter type of person (student/profesor):");
        String type = scanner.nextLine().trim().toLowerCase();

        System.out.println("Name:");
        String name = scanner.nextLine().trim();

        if (type.equals("student") && findStudentByName(name) == null ||
                type.equals("profesor") && findProfessorByName(name) == null) {

            System.out.println("Phone number:");
            String phoneNumber = scanner.nextLine().trim();
            System.out.println("Email:");
            String email = scanner.nextLine().trim();

            if (type.equals("student")) {
                System.out.println("Student number:");
                int studentNumber = Integer.parseInt(scanner.nextLine().trim());
                System.out.println("Average mark:");
                double averageMark = Double.parseDouble(scanner.nextLine().trim());
                System.out.println("Class:");
                int clazz = Integer.parseInt(scanner.nextLine().trim());

                students.add(new Student(name, phoneNumber, email, studentNumber, averageMark, clazz));
            } else if (type.equals("profesor")) {
                System.out.println("Course:");
                String course = scanner.nextLine().trim();
                System.out.println("Year:");
                int year = Integer.parseInt(scanner.nextLine().trim());

                professors.add(new Profesor(name, phoneNumber, email, course, year));
            }
        } else {
            System.out.println("Already existing");
        }
    }

    public void read(Scanner scanner) {
        System.out.println("Enter the name to search:");
        String name = scanner.nextLine().trim();

        Student student = findStudentByName(name);
        if (student != null) {
            System.out.println(student); // student.toString()
            return;
        }

        Profesor professor = findProfessorByName(name);
        if (professor != null) {
            System.out.println(professor); // professor.toString()
            return;
        }

        System.out.println("Not existing");
    }

    public void update(Scanner scanner) {
        // No action defined
    }

    public void delete(Scanner scanner) {
        System.out.println("Enter the name to delete:");
        String name = scanner.nextLine().trim();

        Student student = findStudentByName(name);
        if (student != null) {
            students.remove(student);
            System.out.println("Student removed successfully.");
            return;
        }

        Profesor professor = findProfessorByName(name);
        if (professor != null) {
            professors.remove(professor);
            System.out.println("Professor removed successfully.");
            return;
        }

        System.out.println("Not existing");
    }

    private Student findStudentByName(String name) {
        return students.stream()
                .filter(s -> s.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    private Profesor findProfessorByName(String name) {
        return professors.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

}
