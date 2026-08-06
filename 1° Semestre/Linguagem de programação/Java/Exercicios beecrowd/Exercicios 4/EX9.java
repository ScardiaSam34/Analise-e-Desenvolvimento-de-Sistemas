import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);

        char operacao = in.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        double soma = 0;
        int contagem = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = in.nextDouble();
                if (j > i) {
                    soma += M[i][j];
                    contagem++;
                }
            }
        }
        if (operacao == 'M') {
            soma /= contagem;
        }
        System.out.printf("%.1f%n", soma);
    }
}