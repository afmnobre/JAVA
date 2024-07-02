import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char resp = 's';

    while(resp != 'n') {
        System.out.println("Digite a temperatura em CELSIUS: ");
        double C = sc.nextDouble();
        double F = 9.0 * C / 5.0 + 32.00;
        System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
        System.out.println("Deseja repetir (s/n)?");
        resp = sc.next().charAt(0);
    }

    sc.close();

    }
}
