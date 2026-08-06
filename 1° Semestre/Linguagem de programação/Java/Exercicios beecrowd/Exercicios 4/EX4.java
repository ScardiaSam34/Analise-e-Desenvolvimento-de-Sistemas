import java.util.Scanner;

public class EX4{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        if (in.hasNextInt()) {
            int T = in.nextInt();
            int[] N = new int[1000];

            for (int i = 0; i < 1000; i++) {
                N[i] = i % T;
                System.out.println("N[" + i + "] = " + N[i]);
            }
        }
    }
}