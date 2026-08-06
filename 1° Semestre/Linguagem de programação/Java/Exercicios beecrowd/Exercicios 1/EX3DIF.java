import java.util.Scanner;

public class EX3DIF{
    public static void main(String[] args) throws Exception{

        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int result = (a * b)-(c * d);

        System.out.println("DIFERENCA = " + result);

    }
}
