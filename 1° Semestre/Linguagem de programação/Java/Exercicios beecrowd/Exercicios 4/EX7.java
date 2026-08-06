import java.util.Scanner;

public class EX7{
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        int linhaAlvo = in.nextInt();
        char operacao = in.next().toUpperCase().charAt(0);
        double soma = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                double valor = in.nextDouble();
                if (i == linhaAlvo) {
                    soma += valor;
                }
            }
        }
        if (operacao == 'M') {
            soma /= 12.0;
        }
        System.out.printf("%.1f%n", soma);
    }
}