import java.util.Scanner;
public class FuncoesMatematicas1 {
    public static void main(String[] args) {

    double x = 3.0;
    double y = 4.0;
    double z = -5.0;
    double A,B,C;

    System.out.println("############### RAIZ QUADRADA #################");
    A = Math.sqrt(x);
    B = Math.sqrt(y);
    C = Math.sqrt(25.0);
    System.out.println("Raiz quadrada de " + x + " = " + A);
    System.out.println("Raiz quadrada de " + y + " = " + B);
    System.out.println("Raiz quadrada de 25 = " + C);

    System.out.println("################ POTENCIAÇÃO ##################");
    A = Math.pow(x, y);
    B = Math.pow(x, 2.0);
    C = Math.pow(5.0, 2.0);
    System.out.println(x + " elevado a " + y + " = " + A);
    System.out.println(x + " elevado ao quadrado = " + B);
    System.out.println("5 elevado ao quadrado " + C);

    System.out.println("################## ABSOLUTO ###################");
    A = Math.abs(y);
    B = Math.abs(z);
    System.out.println("Valor absoluto de " + y + " = " + A);
    System.out.println("Valor absoluto de " + z + " = " + B);

    System.out.println("###############################################");
    System.out.println("Função que faz a Raiz Quadrada");
    double DELTA, X1, X2, a, b, c;
    a = 2.0;
    b = -16.0;
    c = -18.0;

    DELTA = Math.pow(b, 2.0) - 4 * a * c;
    X1 = (-b + Math.sqrt(DELTA)) / (2.0 * a);
    X2 = (-b - Math.sqrt(DELTA)) / (2.0 * a);
    System.out.printf("O Valor de DELTA é: %.2f%n", DELTA);
    System.out.printf("O Valor de X1 é: %.2f%n", X1);
    System.out.printf("O Valor de X2 é: %.3f%n", X2);


    }
}
