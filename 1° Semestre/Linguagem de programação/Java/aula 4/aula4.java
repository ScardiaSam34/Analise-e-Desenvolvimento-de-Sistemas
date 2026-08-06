    import java.util.Scanner;

    public class aula4 {
        public static void main(String[] args) throws Exception {
            double a,b,c;
            System.out.println("Digite 3 valores separados por espaço: ");

            Scanner in = new Scanner(System.in);
            a = in.nextDouble();
            b = in.nextDouble();
            c = in.nextDouble();
            in.close();

            if (a<(b+c) && a>Math.abs(b-c) && b<(a+c) && b>Math.abs(a-c) && c<(a+b) && c>Math.abs(a-b)) {
                if(a==b && b==c)
                    System.out.println("Triangulo Equilatero");
                else if(a==b || a==c || b==c)
                    System.out.println("triangulo Isoceles");
                else
                    System.out.println("Triangulo Escaleno");
            } else {
                System.out.println("Os valores fornecidos não foram um triangulo");
            }
        }
    }