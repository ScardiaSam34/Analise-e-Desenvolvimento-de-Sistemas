import java.util.Scanner;

public class EX5SLB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fun;
        double numS, numV, total;

        fun = in.nextLine();
        numS = in.nextDouble();
        numV = in.nextDouble();
        
        total = numS + (0.15 * numV);

        System.out.printf("TOTAL = R$ %.2f\n", total);
    }
}
