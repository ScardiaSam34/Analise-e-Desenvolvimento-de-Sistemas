import java.io.IOException;
import java.util.Scanner;

public class EX3{
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        while (in.hasNextLong()) {
            long m = in.nextLong();
            long n = in.nextLong();
            
            long soma = fatorial(m) + fatorial(n);
            
            System.out.println(soma);
        }
        in.close();
    }
    
    public static long fatorial(long num) {
        long fat = 1;
        for (int i = 2; i <= num; i++) {
            fat *= i;
        }
        return fat;
    }
}