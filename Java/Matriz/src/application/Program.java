package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Escreva o tamanho da Matriz: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("--------------------------------------");
		int [][] mat = new int[n][n];
		//POPULANDO MATRIZ
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.println("posição " + i + " posição " + j);
				mat[i][j] = sc.nextInt();
			}
			System.out.println("--------------------------------------");
		}
		//IMPRIMINDO MATRIZ
		for(int i=0;i<n;i++) {
			for(int j=0; j<n;j++) {
				System.out.print(" | " + mat[i][j]);
			}
			System.out.println(" |");
		}
		System.out.println("--------------------------------------");
		//CRIANDO DIAGONAL PRINCIAL
		System.out.println("A Diagonal Principal é:");
		for(int i=0; i<n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		//LER QUANTIDADE DE NUMEROS NEGATIVOS
		int count = 0;
		for (int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.print("A quantidade de numeros negativos é: " + count);
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.print("A quantidade de linhas é: " + mat.length);
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.print("A quantidade de colunas da linha 0 é: " + mat[0].length);
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.print("A quantidade de colunas da linha 1 é: " + mat[1].length);
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.print("A quantidade de colunas da linha 2 é: " + mat[2].length);
		
		sc.close();
	}

}
