
public class matriz{
    public static void main(String[] args) throws Exception{
        int[][] matriz = {
            {4, 2, 1},
            {1, 1, 1},
            {2, 3, 3}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i + j == 2) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }
}