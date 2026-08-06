import java.util.Scanner;

import java.io.IOException;
public class EX10DE2P {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        double x1, x2, y1, y2, dist, subX, subY;

        x1 = in.nextDouble();
        y1 = in.nextDouble();
        x2 = in.nextDouble();
        y2 = in.nextDouble();

        subX = x2 - x1;
        subY = y2 - y1;

        dist = Math.sqrt((subX * subX) + (subY * subY));

        System.out.printf("%.4f\n", dist);
    }
}
