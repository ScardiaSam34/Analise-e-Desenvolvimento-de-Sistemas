import java.util.Scanner;

public class EX1{
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        int[] X = new int[10];

        for (int i = 0; i < 10; i++) {
            X[i] = in.nextInt();
            if (X[i] <= 0) {
                X[i] = 1;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("X[" + i + "] = " + X[i]);
        }
    }
}