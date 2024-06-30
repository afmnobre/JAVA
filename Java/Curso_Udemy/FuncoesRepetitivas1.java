import java.util.Scanner;

public class FuncoesRepetitivas1 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.printf("%n############################################%n");
    System.out.println("WHILE que só para quando se digita o numero 0");
    System.out.printf("DIGITE UM NUMERO: ");
    int NUMERO_1 = sc.nextInt();
    while ( NUMERO_1 != 0 ) {
        System.out.printf("DIGITE UM NUMERO: ");
        NUMERO_1 = sc.nextInt();
    }
    System.out.printf("############################################%n");

    System.out.println("WHILE que só para quando se digita o numero 0 SOMANDO NUMEROS");
    System.out.printf("DIGITE UM NUMERO: ");
    int NUMERO_2 = sc.nextInt();
    int SOMA = 0;
    while ( NUMERO_2 != 0 ) {
        SOMA += NUMERO_2;
        System.out.printf("DIGITE UM NUMERO: ");
        NUMERO_2 = sc.nextInt();
    }
    System.out.println("O VALOR SOMADO É = " + SOMA);
    System.out.printf("############################################%n");

    sc.close();
    }
}
