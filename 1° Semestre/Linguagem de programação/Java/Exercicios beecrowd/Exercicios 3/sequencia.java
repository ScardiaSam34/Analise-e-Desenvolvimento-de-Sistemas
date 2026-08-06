import java.util.Scanner;

public class sequencia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true){
            int x = in.nextInt();

            if (x == 0) break;

            StringBuilder resposta = new StringBuilder();

            for (int i = 1; i <= x; i++) {
                resposta.append(i);

                if (i < x) {
                    resposta.append(" ");
                }
            }
            System.out.println(resposta.toString());
        }
        in.close();
    }
}
