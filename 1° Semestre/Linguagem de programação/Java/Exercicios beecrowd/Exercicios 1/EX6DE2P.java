import java.util.Scanner;

public class EX6DE2P {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int kmT;
        double cumG,kmL;

        kmT = in.nextInt();
        cumG = in.nextDouble();

        kmL = kmT / cumG;

        System.out.printf("%.3f km/l\n", kmL);
    }
}
