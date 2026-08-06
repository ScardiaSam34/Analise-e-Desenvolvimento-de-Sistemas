import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int HI,HF,duracao;

        HI = in.nextInt();
        HF = in.nextInt();
        
        in.close();

        if (HI < HF) {
            duracao = HF - HI;
        } else {
            duracao = 24 - HI + HF;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}