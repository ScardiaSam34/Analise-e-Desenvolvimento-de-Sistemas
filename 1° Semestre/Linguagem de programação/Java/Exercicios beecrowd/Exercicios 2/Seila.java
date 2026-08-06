import java.util.Scanner;

public class Seila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double delta = (B * B) - (4 * A * C);

        if (A == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            double r1 = (-B + Math.sqrt(delta)) / (2 * A);
            double r2 = (-B - Math.sqrt(delta)) / (2 * A);

            String s1 = String.format("R1 = %.5f", r1).replace(",", ".");
            String s2 = String.format("R2 = %.5f", r2).replace(",", ".");

            System.out.println(s1);
            System.out.println(s2);
        }

        sc.close();
    }
}