import java.util.Scanner;

public class EX5{
    public static int fibonacci(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int casos = in.nextInt();

        for (int i = 0; i < casos; i++) {

            int n = in.nextInt();

            int resultado = fibonacci(n);

            System.out.println("Fib(" + n + ") = " + resultado);
        }
    }
}