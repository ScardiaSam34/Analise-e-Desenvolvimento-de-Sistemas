import java.io.IOException;
import java.util.Scanner;

public class EX8AID {
     public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int a,b,c,d,f;

        a = in.nextInt();
        b = a/365;
        c = a-(365*b);
        d = c/30;
        f = c-(30*d);
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n",b,d,f);
    }
}