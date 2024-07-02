import java.util.Scanner;
public class CriarFuncoes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com três numeros");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int MAIOR = Maximo(A, B, C);

        mostrarResultado(MAIOR);

        sc.close();
    }
    //FUNÇÃO PARA LOCALIZAR O MAIOR NUMERO.
    public static int Maximo(int x, int y, int z){
        int AUXILIAR;

        if(x > y && x > z){
            AUXILIAR = x;
        } else if (y > z) {
            AUXILIAR = y;
        } else {
            AUXILIAR = z;
        }
    return AUXILIAR;
    }
    //FUNÇÃO PARA TRATAR O RESULTADO DO MAIOR VALOR.
    public static void mostrarResultado(int VALOR){
        System.out.println("O maior valor é: " +  VALOR);
    }
}
