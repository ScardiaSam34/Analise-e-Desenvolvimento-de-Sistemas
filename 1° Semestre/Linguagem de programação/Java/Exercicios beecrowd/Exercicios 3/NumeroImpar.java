import java.util.Scanner;

public class NumeroImpar {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        int x;

        x = in.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
