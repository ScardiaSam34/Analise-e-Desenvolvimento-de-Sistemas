import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] X = new int[N];
        int menorValor = 0;
        int posicao = 0;

        for (int i = 0; i < N; i++) {
            X[i] = in.nextInt();
            if (i == 0) {
                menorValor = X[i];
                posicao = 0;
            } else {
                if (X[i] < menorValor) {
                    menorValor = X[i];
                    posicao = i;
                }
            }
        }
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Posicao: " + posicao);
    }
}