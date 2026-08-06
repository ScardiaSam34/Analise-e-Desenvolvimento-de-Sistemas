import java.io.IOException;
import java.util.Scanner;
import java.math.BigInteger;

public class EX4{
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        if (in.hasNextInt()) {
            int n = in.nextInt();

            BigInteger doze = BigInteger.valueOf(12);
            BigInteger mil = BigInteger.valueOf(1000);
            
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                
                BigInteger totalGraos = BigInteger.valueOf(2).pow(x);
                
                totalGraos = totalGraos.subtract(BigInteger.ONE);
                
                BigInteger totalGramas = totalGraos.divide(doze);
                
                BigInteger totalKg = totalGramas.divide(mil);
                
                System.out.println(totalKg + " kg");
            }
        }
        in.close();
    }
}