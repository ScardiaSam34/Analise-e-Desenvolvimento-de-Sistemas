import java.util.Scanner;

public class EX1Media{
    public static void main(String[] args) throws Exception{
        double n1, n2, n3, n4, media, exame;

        Scanner in = new Scanner(System.in);
        n1 = in.nextDouble();
        n2 = in.nextDouble();
        n3 = in.nextDouble();
        n4 = in.nextDouble();

        media = n1*0.2 + n2*0.3 + n3*0.4 + n4*0.1;
        media = media*10;

        System.out.printf("Media: %.1f\n", media);

        if(media>=7) 
            System.out.println("Aluno aprovado.");
        else if(media<5)
            System.out.println("Aluno reprovado.");
        else{
            System.out.println("Aluno em exame.");
            exame = in.nextDouble();
            in.close();
            System.out.printf("Nota do exame: %.1f\n",exame);
            media = (media+exame)/2;
            if(media<=5);
                System.out.println("Aluno aprovado.");
            System.out.printf("Media final: %.1f\n",media);
        }

    }
}
