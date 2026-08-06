import java.util.Scanner;

public class EX4SL {
    public static void main(String[] args) throws Exception{
        int numF,numH;
        double numV,result;

        Scanner in = new Scanner(System.in);

        numF = in.nextInt();
        numH = in.nextInt();
        numV = in.nextDouble();

        result = numH*numV;

        System.out.println("NUMBER = "+numF);
        System.out.printf("SALARY = U$ %.2f\n", result);
        
    }
}
