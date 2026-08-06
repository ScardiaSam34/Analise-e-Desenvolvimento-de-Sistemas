import java.util.Scanner;

public class multiplicacao {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        int ent,result,i;

        ent = in.nextInt();
        for(i = 1; i <= 10; i++ ){
            result = i * ent;
        
        System.out.println(i + " x " + ent + " = " + result);
        }
    }
}
