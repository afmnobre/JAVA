import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

       Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE A LARGURA DO LOTE:");
        double largura = sc.nextDouble();
        System.out.println("DIGITE O COMPRIMENTO DO LOTE:");
        double comprimento = sc.nextDouble();
        System.out.println("DIGITE O PREÇO POR METRO QUADRADO DO LOTE:");
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("%n##########################################%n");
        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = R$ %.2f%n", preco);
        System.out.printf("###########################################%n");
        sc.close();

    }
}

