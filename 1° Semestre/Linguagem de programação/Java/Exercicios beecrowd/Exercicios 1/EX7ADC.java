import java.util.Scanner;

public class EX7ADC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double raio,n,A;

        raio = in.nextDouble();
        n = 3.14159;
        A = n * (raio * raio);

        System.out.printf("A=%.4f\n",A);
    }
}
