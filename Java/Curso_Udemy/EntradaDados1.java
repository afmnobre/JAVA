import java.util.Scanner;
public class EntradaDados1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x;
        System.out.println("Digite um nome:");
        x = sc.next();
        System.out.println("O Seu nome é: " + x);

        int y;
        System.out.println("Digite uma idade:");
        y = sc.nextInt();
        System.out.println("Sua Idade é: " + y);

        double z;
        System.out.println("Digite seu Salario:");
        z = sc.nextDouble();
        System.out.printf("Seu Salario é: R$ %.2f%n", z);

        char w;
        System.out.println("Digite F para Feminino e M para Masculino.");
        w = sc.next().charAt(0);
        System.out.println("Seu sexo é: " + w);

        System.out.printf("%n%n%n%nLENDO VARIOS DADOS DE UMA UNICA VEZ%n");
        System.out.printf("Tem que separar os dados com espaço.%n");
        System.out.printf("A ordem dos campos é: %n");
        System.out.println("NOME");
        System.out.println("IDADE");
        System.out.println("SALARIO");

        System.out.println("Começe a digitar:");

        String NOME;
        int IDADE;
        double SALARIO;

        NOME = sc.next();
        IDADE = sc.nextInt();
        SALARIO = sc.nextDouble();

        System.out.println("Os dados digitatos são:");
        System.out.println(NOME);
        System.out.println(IDADE);
        System.out.println(SALARIO);

        sc.close();
    }
}
