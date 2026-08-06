import java.util.Scanner;
import java.util.Arrays;

public class Triangulo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] lados = new double[3];
        lados[0] = in.nextDouble();
        lados[1] = in.nextDouble();
        lados[2] = in.nextDouble();

        Arrays.sort(lados);
        double A = lados[2];
        double B = lados[1];
        double C = lados[0];

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (A * A == (B * B + C * C)) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (A * A > (B * B + C * C)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || A == C || B == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        in.close();
    }
}