import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) throws Exception{
        int num, result; // declaração das variaveis

        System.out.println("Digite um numero inteiro:"); // pedindo a entrada

        Scanner in = new Scanner(System.in); // inicializando o scanner
        num = in.nextInt(); // lê um valor inteiro do teclado

        result = num * 2; 
        System.out.println("O dobro de " + num + " é " + result);
    }    
}
