import java.util.Scanner;

public class EntradaDados2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        String s1, s2, s3;

        System.out.println("Digite 1 NUMERO e 3 nomes COMPLETOS:");
        numero = sc.nextInt();
        sc.nextLine(); //Quando se usa o nextInt ele da um ENTER que carrega o nextLine abaixo com um espaço em branco, por isso precisa usar um nextLine me branco para corrigir isso.
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(numero);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
