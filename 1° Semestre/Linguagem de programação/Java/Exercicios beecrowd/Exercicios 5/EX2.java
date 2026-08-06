import java.io.IOException;
import java.util.Scanner;

public class EX2{
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        while (in.hasNextInt()) {
            int n = in.nextInt();
            StringBuilder matriz = new StringBuilder();
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i + j == n - 1) {
                        matriz.append("2");
                    }
                    else if (i == j) {
                        matriz.append("1");
                    }
                    else {
                        matriz.append("3");
                    }
                }
                matriz.append("\n");
            }
            System.out.print(matriz.toString());
        }
        in.close();
    }
}