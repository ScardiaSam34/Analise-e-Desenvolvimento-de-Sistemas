import java.util.Scanner;

public class fibonacch {
    public static void main(String[] args) throws Exception{
        int n, previous, next;
        previous = 0;
        next = 1;

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println(0 + " ");

            for(int i=0;i<n-1;i++){
                int aux = next;
                next += previous;  //next = next + previous
                previous = aux;

                System.out.print(previous + " ");
            }
            System.out.println();
    }
}