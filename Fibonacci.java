import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti N: ");
        int N = scanner.nextInt();

        System.out.println("Elementul " + N + " al secventei Fibonacci este: " + fib(N));
    }

    public static long fib(int N) {
        if (N <= 1) {
            return N;
        }
        long prev = 0, next = 1;
        for (int i = 2; i <= N; i++) {
            long sum = prev + next;
            prev = next;
            next = sum;
        }
        return next;
    }
}
