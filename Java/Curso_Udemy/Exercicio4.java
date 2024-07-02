import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("----------------------------------");
        System.out.println("Enter the measures of triangle X: ");
        System.out.printf("first side:  ");
        xA = sc.nextDouble();
        System.out.printf("second side: ");
        xB = sc.nextDouble();
        System.out.printf("Third side:  ");
        xC = sc.nextDouble();
        System.out.println("----------------------------------");
        System.out.println("Enter the measures of triangle Y: ");
        System.out.printf("first side:  ");
        yA = sc.nextDouble();
        System.out.printf("second side: ");
        yB = sc.nextDouble();
        System.out.printf("Third side:  ");
        yC = sc.nextDouble();
        System.out.println("----------------------------------");


        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p - xA) * (p - xB) * (p -xC);

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p - yA) * (p - yB) * (p - yC);

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        System.out.println("----------------------------------");

        if (areaX > areaY){
            System.out.println("Larger area: X");
        }else{
            System.out.println("Larger area: Y");
        }

        sc.close();
        }
}
