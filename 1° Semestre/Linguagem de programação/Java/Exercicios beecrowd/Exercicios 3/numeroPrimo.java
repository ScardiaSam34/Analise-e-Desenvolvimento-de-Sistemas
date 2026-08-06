import java.util.Scanner;

public class numeroPrimo {
    public static void main(String[] args) {
        int qtd, n;

        Scanner in = new Scanner(System.in);
        qtd = in.nextInt();

        for(int i=0; i<qtd; i++){
            n = in.nextInt();
            int aux = n/2;
            boolean ehPrimo = true;
            while(aux>1){
                if (n%aux==0){
                    ehPrimo = false;
                    break;                    
                }
                aux--;
            }
            if (ehPrimo)
                System.out.println(n+" eh primo");
            else
                System.out.println(n+" nao eh primo");
        }
    }
}
