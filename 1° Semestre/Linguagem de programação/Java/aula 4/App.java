import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double n1, n2, result;
        int option;

        System.out.println("Digite dois valores separados por espaço");

        Scanner in = new Scanner(System.in);
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        System.out.println( "Escolha uma opcao:\n"+
                            "-------------------------\n"+
                            "Menu:\n"+
                            "1. Soma\n"+
                            "2. Subtracao\n"+
                            "3. Multiplicacao\n"+
                            "4. Divisao\n"+
                            "---------------------------"
        );

        option = in.nextInt();
        in.close();

        switch (option) {
            case 1: result = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + result);
                break;
            case 2: result = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + result);
                break;
            case 3: result = n1 * n2;
                System.out.println(n1 + " x " + n2 + " = " + result);
                break;
            case 4: if(n2==0);
                        System.out.println("Erro de divisao por zero");
                    {
                        result = n1 / n2;
                        System.out.println(n1 + " / " + n2 + " = " + result);
                    }
                    break;
            default:
                    System.out.println("Opcao invalida");
        }
    }
}
