import java.util.Locale;
import java.util.Scanner;
public class FuncoesCondicionais1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("###################################################################################");
        System.out.println("###################################################################################");
        System.out.println("DIGITE 1 NUMERO.(Abaixo de 100 o valor é 50 reais, numero acima de 100 o excedente é multiplicado por 2)");
        int minutos = sc.nextInt();
        double conta = 50.0;
        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }
        System.out.printf("Valor da conta = R$ %.2f%n", conta);

        System.out.println("###################################################################################");
        System.out.println("###################################################################################");
        System.out.println("DIGITE 1 de 1 até 7 NUMERO PARA O DIA DA SEMANA COM IF");
        int x = sc.nextInt();
        String dia;
        if (x == 1) {
            dia = "DOMIGO";
        }
        else if (x == 2) {
            dia = "SEGUNDA-FEIRA";
        }
        else if (x == 3) {
            dia = "TERÇA-FEIRA";
        }
        else if (x == 4) {
            dia = "QUARTA-FEIRA";
        }
        else if (x == 5) {
            dia = "QUINTA-FEIRA";
        }
        else if (x == 6) {
            dia = "SEXTA-FEIRA";
        }
        else if (x == 7) {
            dia = "SABADO";
        }
        else {
            dia = "ERRO, NUMERO INVÁLIDO";
        }
        System.out.println("Dia da semana: " + dia);

        System.out.println("###################################################################################");
        System.out.println("###################################################################################");
        System.out.println("DIGITE 1 de 1 até 7 NUMERO PARA O DIA DA SEMANA COM WITCH CASE");
        int y = sc.nextInt();
        String DIA;
        switch (y) {
            case 1:
                DIA = "domingo";
                break;
            case 2:
                DIA = "segunda";
                break;
            case 3:
                DIA = "terca";
                break;
            case 4:
                DIA = "quarta";
                break;
            case 5:
                DIA = "quinta";
                break;
            case 6:
                DIA = "sexta";
                break;
            case 7:
                DIA = "sabado";
                break;
            default:
                DIA = "valor invalido";
                break;
        }
        System.out.println("Dia da semana: " + DIA);

        System.out.println("###################################################################################");
        System.out.println("###################################################################################");
        System.out.println("VARIOS EXEMPLOS DE OPERADORES TERNARIOS - (CONDICAO EM UMA LINHA)");
        System.out.println("DIGITE UM NOME, se for diferente de LUCAS dara um ERRO.");
        String NOME = sc.next();
        String CORRETO = ( NOME.equals("LUCAS") ) ? "CERTO" : "ERRADO";
        System.out.println("O nome esta " + CORRETO);

        sc.close();
    }
}
