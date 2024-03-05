import java.util.Scanner;

public class ComparaNumere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti primul numar: ");
        int numar1 = scanner.nextInt();
        System.out.print("Introduceti al doilea numar: ");
        int numar2 = scanner.nextInt();
        System.out.print("Introduceti al treilea numar: ");
        int numar3 = scanner.nextInt();

        int temp;

        if (numar1 > numar2) {
            temp = numar1;
            numar1 = numar2;
            numar2 = temp;
        }

        if (numar2 > numar3) {
            temp = numar2;
            numar2 = numar3;
            numar3 = temp;
        }

        if (numar1 > numar2) {
            temp = numar1;
            numar1 = numar2;
            numar2 = temp;
        }

        System.out.println(numar1 + " < " + numar2 + " < " + numar3);
    }
}
