import java.util.Scanner;

public class numerosPositivos {
    public static void main(String[] args)throws Exception{
        Scanner in = new Scanner(System.in);
        double sm = 0;
        double[] ent = new double[6]; 
        int i;
        
        for(i = 0; i < 6; i++){
            ent[i] = in.nextDouble();

            if (ent[i] > 0){
                sm++;
            }
        }
        System.out.println(sm + "valores");
    }
}
