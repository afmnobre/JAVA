import java.util.Scanner;

public class OperadorBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("###############################");
        System.out.println("OPERADORES BITWISE");
        System.out.println("& - OPERADOR 'E' (BIT A BIT)");
        System.out.println("| = OPERADOR 'OU' (BIT A BIT)");
        System.out.println("^ - OPERADOR 'OU-exclusivo' (BIT A BIT)");

        System.out.println("###############################");
        System.out.println("| C1 | C2 | C1'E'C2 |");
        System.out.println("| F  | F  |    F    |");
        System.out.println("| F  | V  |    F    |");
        System.out.println("| V  | F  |    F    |");
        System.out.println("| V  | V  |    V    |");

        System.out.println("###############################");
        System.out.println("| C1 | C2 | C1'OU'C2 |");
        System.out.println("| F  | F  |     F    |");
        System.out.println("| F  | V  |     V    |");
        System.out.println("| V  | F  |     V    |");
        System.out.println("| V  | V  |     V    |");

        System.out.println("###############################");
        System.out.println("| C1 | C2 | C1'XOR'C2 |");
        System.out.println("| F  | F  |     F     |");
        System.out.println("| F  | V  |     V     |");
        System.out.println("| V  | F  |     V     |");
        System.out.println("| V  | V  |     F     |");
        System.out.println("###############################");

        System.out.println("Exemplo com numeros BINARIOS:");
        System.out.println("Comparando os dois NUMEROS BINARIOS ABAIXO:");
        System.out.println("0101 1001 (89)");
        System.out.println("0011 1100 (60)");
        System.out.println("TEMOS OS SEGUINTE RESULTADOS DE ACORDO COM OS OPERADORES:");
        System.out.println("& - 0001 1000 (24)");
        System.out.println("| - 0111 1101 (125)");
        System.out.println("^ - 0110 0101 (101)");

        System.out.println("###############################");
        System.out.println("Fazendo o exemplo acima com JAVA");
        int n1 = 89;
        int n2 = 60;
        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);

        System.out.println("###############################");
        System.out.println("Digite um numero para verificar se o 3 Bit é verdadeiro(1)");
        System.out.println("Os bits são: 128 64 32 16 8 4 2 1");
        System.out.println("Os bits acima são contados da direita pra esquerda.");
        int NUMERO = sc.nextInt();
        String RESULTADO = (( NUMERO & 4 ) != 0 ) ? "MARCADO" : "NAO_MARCADO";
        System.out.println(RESULTADO);

        System.out.println("###############################");
        System.out.println("DIGITE O BIT QUE DESEJA VERIFICAR (1 até 8)");
        int BITS = 1;
        for(int contar = 0; contar <= 7; contar ++){
            System.out.println(contar+1 +")" + BITS);
            if(BITS == 1){
                BITS = BITS + 1;
            }else{
                BITS = BITS * 2;
            }
        }
        int BIT = sc.nextInt();
        System.out.println("DIGITE O NUMERO QUE DESEJA VERIFICAR O BIT");
        int VERIFICAR = sc.nextInt();
        if ((BIT & VERIFICAR) != 0){
            System.out.println("O " + BIT + " BIT ESTA NO NUMERO DIGITADO.");
        }else{
            System.out.println("O " + BIT + " BIT NÃO ESTA NO NUMERO DIGITADO.");
        }
        sc.close();

    }
}
