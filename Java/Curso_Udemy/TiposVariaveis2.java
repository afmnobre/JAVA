import java.util.Locale;

public class TiposVariaveis2 {
    public static void main(String[] args) throws Exception {
        double x = 10.34849;
        int y = 32;
        System.out.println("Hello, World!");
        System.out.println("Bom Dia");
        System.out.println("Escrevendo umm numero FLOAT");
        System.out.println(x);
        System.out.println("Escrevendo umm numero INTEIRO");
        System.out.println(y);
        System.out.println("Escrevendo umm numero FLOAT e controlando as casas decimais");
        System.out.printf("%.2f%n",x);
        System.out.println("Escrevendo umm numero FLOAT e controlando as casas decimais");
        System.out.printf("%.4f%n",x);
        Locale.setDefault(Locale.US);
        System.out.println("Mudando o LOCALE para o padrão AMERICANO US");
        System.out.printf("%.4f%n",x);
        System.out.println("Concatenação com o +");
        System.out.println("Numero 1 = " + x + " NUMERO 2 = " + y);
        System.out.println("Impressao sem concatenação");
        System.out.printf("Numero = %.2f %n", x);
        System.out.println("Impressao de varias variaveis em uma unica linha.");
        System.out.println("%f = FLOAT.");
        System.out.println("%d = INTEIRO.");
        System.out.println("%s = TEXTO.");
        String nome = "MARIA";
        int idade = 31;
        double renda = 4000.00;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
        
    }
}
