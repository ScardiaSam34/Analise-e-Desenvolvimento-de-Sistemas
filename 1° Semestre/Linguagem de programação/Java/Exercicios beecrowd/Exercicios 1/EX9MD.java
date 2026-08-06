import java.util.Scanner;

import java.io.IOException;

public class EX9MD {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        double A,B,C,media;

        A = in.nextDouble();
        B = in.nextDouble();
        C = in.nextDouble();

        media = ((A*2)+(B*3)+(C*5))/10;

        System.out.printf("MEDIA = %.1f\n",media);
    }
}
